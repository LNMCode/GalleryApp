package com.lnmcode.galleryapp.presentation.ui.boards

import android.view.View
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.adapter.SectionRow
import com.lnmcode.galleryapp.presentation.viewholder.BoardViewHolder

class BoardsAdapter : BaseAdapter(){

    init {
        addSection(arrayListOf<Topics>())
    }

    fun addTopics(topics: List<Topics>) {
        sections().first().run {
            clear()
            addAll(topics)
            notifyDataSetChanged()
        }
    }

    override fun layout(sectionRow: SectionRow) = R.layout.layout_item_boards

    override fun viewHolder(layout: Int, view: View) = BoardViewHolder(view)
}