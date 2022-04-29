package com.lnmcode.galleryapp.presentation.viewholder

import android.view.View
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.databinding.LayoutItemTopicsBoardsBinding
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import timber.log.Timber

class BoardTopicsViewHolder(
    view: View,
) : BaseViewHolder(view){
    private lateinit var data: TopicsCacheDomain
    private val binding: LayoutItemTopicsBoardsBinding by bindings()

    override fun bindData(data: Any) {
        if (data is TopicsCacheDomain) {
            this.data = data
            setUpLayout()
        }
    }

    private fun setUpLayout() {
        binding.apply {
            topics = data
        }
    }

    override fun onClick(v: View?) {
        Timber.d("BoardTopicsViewHolder clicked: ${data.title}")
    }
}