package com.lnmcode.galleryapp.presentation.ui.detail

import androidx.databinding.Bindable
import com.lnmcode.galleryapp.bindables.BindingViewModel
import com.lnmcode.galleryapp.bindables.bindingProperty
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto

class DetailViewModel : BindingViewModel() {

    @get:Bindable
    var topicPhoto: TopicPhoto? by bindingProperty(null)
        private set


    fun setTopicPhotoArgs(topicPhoto: TopicPhoto) {
        this.topicPhoto = topicPhoto
    }

}