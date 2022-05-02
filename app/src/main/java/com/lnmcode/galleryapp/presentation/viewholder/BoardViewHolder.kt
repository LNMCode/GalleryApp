package com.lnmcode.galleryapp.presentation.viewholder

import android.view.View
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.databinding.LayoutItemBoardsBinding
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import com.lnmcode.galleryapp.presentation.ui.boards.BoardsActionCacheEvent
import timber.log.Timber

class BoardViewHolder(
    view: View,
    private val onChangeLayout: OnChangeLayout,
    private val boardsActionCacheEvent: BoardsActionCacheEvent,
) : BaseViewHolder(view) {

    private lateinit var data: Topics
    private val binding: LayoutItemBoardsBinding by bindings()

    override fun bindData(data: Any) {
        if (data is Topics) {
            this.data = data
            setUpLayout()
        }
    }
    private fun setUpLayout() {
        binding.apply {
            topic = data
            imgIconCard.setOnClickListener {
                val topicsData = TopicsCacheDomain(
                    id = data.id,
                    slug = data.slug,
                    title = data.title,
                    description = data.description
                )
                boardsActionCacheEvent.insertTopicsCache(topicsData)
            }
        }
    }

    override fun onClick(v: View?) {
        Timber.d("BoardViewItem clicked ${data.title}")
        onChangeLayout.onChangeWithParameters(data.id)
    }
}