package com.lnmcode.galleryapp.presentation.viewholder

import android.util.Log
import android.view.View
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.databinding.LayoutItemGridviewGalleryBinding
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import timber.log.Timber

class GalleryGridViewHolder(
    view: View,
    private val onChangeLayout: (TopicPhoto) -> Unit,
) : BaseViewHolder(view) {

    private lateinit var data: TopicPhoto
    private val binding: LayoutItemGridviewGalleryBinding by bindings()

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
        Timber.d("GalleryGridViewHolder clicked item ${data.id}")
        onChangeLayout(data)
    }
}