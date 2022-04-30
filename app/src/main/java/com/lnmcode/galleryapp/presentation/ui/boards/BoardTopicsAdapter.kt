package com.lnmcode.galleryapp.presentation.ui.boards

import android.view.View
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.adapter.SectionRow
import com.lnmcode.galleryapp.presentation.viewholder.BoardTopicsViewHolder

class BoardTopicsAdapter(
    private val deleteTopicsCache: (topicsCacheDomain: TopicsCacheDomain) -> Unit,
) : BaseAdapter<TopicsCacheDomain>() {

    init {
        addSubmit(listOf())
    }

    fun addTopics(topics: List<TopicsCacheDomain>) {
        addSubmit(topics)
    }

    override fun layout() = R.layout.layout_item_topics_boards

    override fun viewHolder(view: View) = BoardTopicsViewHolder(view, deleteTopicsCache)

    override fun areItemsTheSameItem(
        oldItem: TopicsCacheDomain,
        newItem: TopicsCacheDomain
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSameItem(
        oldItem: TopicsCacheDomain,
        newItem: TopicsCacheDomain
    ): Boolean {
        return oldItem.id == newItem.id
    }
}