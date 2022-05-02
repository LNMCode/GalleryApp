package com.lnmcode.galleryapp.presentation.viewholder

import android.util.Log
import android.view.View
import com.lnmcode.galleryapp.business.domain.models.topic.Topic
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.databinding.LayoutItemGalleryBinding
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import timber.log.Timber

class GalleryViewHolder(
    view: View,
    private val onChangeLayout: OnChangeLayout,
) : BaseViewHolder(view) {

    private lateinit var data: TopicPhoto
    private val binding: LayoutItemGalleryBinding by bindings()
    override fun bindData(data: Any) {
        if (data is TopicPhoto) {
            this.data = data
            setUpLayout()
        }
    }

    private fun setUpLayout() {
        binding.apply {
            topicPhoto = data
        }
    }

    override fun onClick(v: View?) {
        Timber.d("GalleryViewHolder clicked item ${data.id}")
        onChangeLayout.onChangeWithParameters(data)
    }

}