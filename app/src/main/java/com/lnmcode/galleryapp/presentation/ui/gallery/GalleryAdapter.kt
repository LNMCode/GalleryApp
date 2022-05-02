package com.lnmcode.galleryapp.presentation.ui.gallery

import android.view.View
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.models.topic.Topic
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import com.lnmcode.galleryapp.presentation.viewholder.GalleryGridViewHolder
import com.lnmcode.galleryapp.presentation.viewholder.GalleryViewHolder
import timber.log.Timber


class GalleryAdapter(
    private val onChangeLayout: OnChangeLayout,
) : BaseAdapter<TopicPhoto>() {
    fun addTopics(topicPhoto: List<TopicPhoto>) {
        addSubmit(topicPhoto)
    }

    override fun layout() = R.layout.layout_item_gridview_gallery

    override fun viewHolder(view: View) = GalleryGridViewHolder(view, onChangeLayout)

    override fun areItemsTheSameItem(oldItem: TopicPhoto, newItem: TopicPhoto): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSameItem(oldItem: TopicPhoto, newItem: TopicPhoto): Boolean {
        return oldItem == newItem
    }

    init {
        Timber.d("Init GalleryAdapter")
    }
}