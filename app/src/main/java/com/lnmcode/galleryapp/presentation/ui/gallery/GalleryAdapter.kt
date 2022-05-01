package com.lnmcode.galleryapp.presentation.ui.gallery

import android.view.View
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.models.topic.Topic
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.viewholder.GalleryViewHolder


class GalleryAdapter : BaseAdapter<TopicPhoto>() {
    fun addTopics(topicPhoto: List<TopicPhoto>) {
        addSubmit(topicPhoto)
    }
    override fun layout() = R.layout.layout_item_gallery

    override fun viewHolder(view: View) = GalleryViewHolder(view)

    override fun areItemsTheSameItem(oldItem: TopicPhoto, newItem: TopicPhoto): Boolean {
            return oldItem.id == newItem.id
        }


    override fun areContentsTheSameItem(oldItem: TopicPhoto, newItem: TopicPhoto): Boolean {
        return oldItem.id == newItem.id
    }
}