package com.lnmcode.galleryapp.presentation.ui.gallery

import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.lnmcode.galleryapp.bindables.BindingViewModel
import com.lnmcode.galleryapp.bindables.asBindingProperty
import com.lnmcode.galleryapp.bindables.bindingProperty
import com.lnmcode.galleryapp.business.datasource.usecase.TopicUseCase
import com.lnmcode.galleryapp.business.domain.models.topic.Topic


class GalleryViewModel (private val topicUserCase: TopicUseCase): BindingViewModel(){
    @get:Bindable
    var isLoading :Boolean by bindingProperty(true)
    private set
    private  val topicFlow =topicUserCase.getTopic(
        id= "BJJMtteDJA4",
        onSuccess = {isLoading =true }
    )
    @get:Bindable
    val topic :Topic? by topicFlow.asBindingProperty(viewModelScope, null)

}