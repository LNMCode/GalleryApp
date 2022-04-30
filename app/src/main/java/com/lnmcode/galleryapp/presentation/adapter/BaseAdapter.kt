package com.lnmcode.galleryapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.recyclerview.widget.*

abstract class BaseAdapter<T> : RecyclerView.Adapter<BaseViewHolder>(), LifecycleObserver {

    private val differ = AsyncListDiffer(
        getAdapterCallBack(),
        getAsyncDifferConfigBuilder()
    )

    fun addSubmit(list: List<T>) {
        differ.submitList(list.toMutableList())
    }

    private fun getDiffCallBack(): DiffUtil.ItemCallback<T> {
        return object : DiffUtil.ItemCallback<T>() {
            override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
                return areItemsTheSameItem(oldItem, newItem)
            }

            override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
                return areContentsTheSameItem(oldItem, newItem)
            }
        }
    }

    private fun getAsyncDifferConfigBuilder() = AsyncDifferConfig.Builder(getDiffCallBack()).build()

    private fun getAdapterCallBack() = RecyclerAdapterCallBack(this)

    /**
     * return layout by resource id
     */
    abstract fun layout(): Int

    /**
     * return viewholder by resource id
     */
    abstract fun viewHolder(view: View): BaseViewHolder

    /**
     * Called to check whether two objects represent the same item.
     */
    abstract fun areItemsTheSameItem(oldItem: T, newItem: T): Boolean

    /**
     * Called to check whether two items have the same data.
     */
    abstract fun areContentsTheSameItem(oldItem: T, newItem: T): Boolean

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(
                layout(), parent, false,
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        try {
            holder.bindData(data = differ.currentList[position] as Any)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun onDestroyed() {

    }

}