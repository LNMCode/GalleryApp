package com.lnmcode.galleryapp.presentation.viewholder

import android.view.View
import androidx.core.view.ViewCompat
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.databinding.LayoutItemGridviewGalleryBinding
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import timber.log.Timber

class GalleryGridViewHolder(
    view: View,
    private val onChangeLayout: OnChangeLayout,
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
        onChangeLayout.onChangeSharedWithParameters(data, binding.image)
    }
}