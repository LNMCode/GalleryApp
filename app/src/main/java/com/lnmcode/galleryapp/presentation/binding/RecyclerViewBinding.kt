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
import com.lnmcode.galleryapp.presentation.ui.gallery.GalleryHeadAdapter

object RecyclerViewBinding {

    @JvmStatic
    @BindingAdapter("adapter", "adapterTopicsList")
    fun bindAdapterPosterList(
        view: RecyclerView,
        adapter: BoardsAdapter,
        topics: List<Topics>?,
    ) {
        if (!topics.isNullOrEmpty()) {
            adapter.addTopics(topics)
            view.adapter = adapter
        }
    }

    @JvmStatic
    @BindingAdapter("adapter", "adapterTopicsCache")
    fun bindAdapterTopicsCache(
        view: RecyclerView,
        adapter: BoardTopicsAdapter,
        topics: List<TopicsCacheDomain>,
    ) {
        adapter.addTopics(topics)
        view.adapter = adapter
    }

    @JvmStatic
    @BindingAdapter("adapter", "adapterTopicPhoto")
    fun bindAdapterTopicPhoto(
        view: RecyclerView,
        adapter: GalleryHeadAdapter,
        topicPhoto: List<TopicPhoto>,
    ) {
        adapter.addTopics(topicPhoto)
        view.adapter = adapter
    }

    @JvmStatic
    @BindingAdapter("adapter", "adapterGridTopicPhoto")
    fun bindAdapterGridTopicPhoto(
        view: RecyclerView,
        adapter: GalleryAdapter,
        topicPhoto: List<TopicPhoto>,
    ) {
        adapter.addTopics(topicPhoto)
        view.adapter = adapter
    }

}