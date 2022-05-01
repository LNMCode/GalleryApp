package com.lnmcode.galleryapp.presentation.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.ui.boards.BoardTopicsAdapter
import com.lnmcode.galleryapp.presentation.ui.boards.BoardsAdapter
import com.lnmcode.galleryapp.presentation.ui.gallery.GalleryAdapter

object RecyclerViewBinding {

    @JvmStatic
    @BindingAdapter("adapter")
    fun bindAdapter(view: RecyclerView, baseAdapter: BaseAdapter<Any>) {
        view.adapter = baseAdapter
    }
    @JvmStatic
    @BindingAdapter("adapterTopicsList")
    fun bindAdapterPosterList(
        view: RecyclerView,
        topics: List<Topics>?,
    ) {
        if (!topics.isNullOrEmpty()) {
            val boardsAdapter = view.adapter as BoardsAdapter
            boardsAdapter.addTopics(topics)
        }
    }

    @JvmStatic
    @BindingAdapter("adapterTopicsCache")
    fun bindAdapterTopicsCache(
        view: RecyclerView,
        topics: List<TopicsCacheDomain>,
    ) {
        val boardTopicsAdapter = view.adapter as BoardTopicsAdapter
        boardTopicsAdapter.addTopics(topics)
    }
    @JvmStatic
    @BindingAdapter("adapterTopicPhoto")
    fun bindAdapterTopicPhoto(
        view: RecyclerView,
        topicPhoto: List<TopicPhoto>,
    ) {
        val galleryAdapter = view.adapter as GalleryAdapter
       galleryAdapter.addTopics(topicPhoto)
    }

}