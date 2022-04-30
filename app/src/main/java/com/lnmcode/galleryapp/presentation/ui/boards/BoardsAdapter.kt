package com.lnmcode.galleryapp.presentation.ui.boards

import android.view.View
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.viewholder.BoardViewHolder

class BoardsAdapter(
    private val insertTopicsCache: (topicsCacheDomain: TopicsCacheDomain) -> Unit,
) : BaseAdapter<Topics>() {

    init {
        addSubmit(listOf())
    }

    fun addTopics(topics: List<Topics>) {
        addSubmit(topics)
    }

    override fun layout() = R.layout.layout_item_boards

    override fun viewHolder(view: View) = BoardViewHolder(view, insertTopicsCache)

    override fun areItemsTheSameItem(
        oldItem: Topics,
        newItem: Topics
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSameItem(
        oldItem: Topics,
        newItem: Topics
    ): Boolean {
        return oldItem.id == newItem.id
    }
}