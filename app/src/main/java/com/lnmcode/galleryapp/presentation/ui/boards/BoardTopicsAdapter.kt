package com.lnmcode.galleryapp.presentation.ui.boards

import android.view.View
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.adapter.SectionRow
import com.lnmcode.galleryapp.presentation.viewholder.BoardTopicsViewHolder

class BoardTopicsAdapter : BaseAdapter() {

    init {
        addSection(arrayListOf<TopicsCacheDomain>())
    }

    fun addTopics(topics: List<TopicsCacheDomain>) {
        sections().first().run {
            clear()
            addAll(topics)
            notifyDataSetChanged()
        }
    }

    override fun layout(sectionRow: SectionRow): Int = R.layout.layout_item_topics_boards
    override fun viewHolder(layout: Int, view: View) = BoardTopicsViewHolder(view)
}