package com.lnmcode.galleryapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.recyclerview.widget.RecyclerView
import java.lang.RuntimeException
import java.util.ArrayList

abstract class BaseAdapter : RecyclerView.Adapter<BaseViewHolder>(), LifecycleObserver {

    private val sections = ArrayList<MutableList<Any>>()

    fun sections(): MutableList<MutableList<Any>> {
        return sections
    }

    fun <T> sectionItems(section: Int): MutableList<Any> {
        return sections[section]
    }

    fun <T> addSection(section: List<T>) {
        sections().add(ArrayList<Any>(section))
    }

    fun <T> addSectionList(sections: List<List<T>>) {
        for (section in sections) {
            addSection(section)
        }
    }

    fun addItemOnSection(section: Int, item: Any) {
        sections()[section].add(item)
    }

    fun <T> addItemListOnSection(section: Int, items: List<T>) {
        sections()[section].addAll(ArrayList<Any>(items))
    }

    fun removeItemOnSection(section: Int, item: Any) {
        sections()[section].remove(item)
    }

    fun sectionCount(section: Int): Int {
        if (section > sections().size - 1) return 0
        return sections()[section].size
    }

    fun <T> insertSection(row: Int, section: List<T>) {
        sections().add(row, ArrayList<Any>(section))
    }

    fun <T> removeSection(section: Int) {
        sections().removeAt(section)
    }

    fun clearSection(section: Int) {
        sections()[section].clear()
    }

    fun clearAllSections() {
        sections().clear()
    }

    /***
     * return layout by section rows
     */
    abstract fun layout(sectionRow: SectionRow): Int

    /***
     * return viewholder by layouts
     */
    abstract fun viewHolder(@LayoutRes layout: Int, view: View): BaseViewHolder

    override fun onViewAttachedToWindow(holder: BaseViewHolder) {
        super.onViewAttachedToWindow(holder)
    }

    override fun onViewDetachedFromWindow(holder: BaseViewHolder) {
        super.onViewDetachedFromWindow(holder)
    }

    override fun onCreateViewHolder(parent: ViewGroup, @LayoutRes viewType: Int): BaseViewHolder {
        return viewHolder(
            viewType,
            LayoutInflater.from(parent.context).inflate(viewType, parent, false),
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val data = objectDataFromPosition(position)

        try {
            holder.bindData(data = data)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return layout(sectionRowFromPosition(position))
    }

    override fun getItemCount(): Int {
        var itemCount = 0
        for (section in sections) {
            itemCount += section.size
        }
        return itemCount
    }

    protected fun objectFromSectionRow(sectionRow: SectionRow): Any {
        return sections[sectionRow.section][sectionRow.row]
    }

    protected fun objectDataFromPosition(position: Int): Any {
        return objectFromSectionRow(sectionRowFromPosition(position))
    }

    private fun sectionRowFromPosition(position: Int): SectionRow {
        val sectionRow = SectionRow()
        var initCur = 0
        for (section in sections) {
            for (item in section) {
                if (initCur == position){
                    return sectionRow
                }
                initCur++
                sectionRow.nextRow()
            }
            sectionRow.nextSection()
        }

        throw RuntimeException("Position $position not found in sections")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun onDestroyed() {
        this.clearAllSections()
    }

}