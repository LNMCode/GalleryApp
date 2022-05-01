package com.lnmcode.galleryapp.presentation.ui.gallery
import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.lnmcode.galleryapp.bindables.BindingViewModel
import com.lnmcode.galleryapp.bindables.asBindingProperty
import com.lnmcode.galleryapp.bindables.bindingProperty
import com.lnmcode.galleryapp.business.datasource.usecase.TopicPhotoUseCase
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto


class GalleryViewModel (private val topicPhotoUserCase: TopicPhotoUseCase): BindingViewModel(){
    @get:Bindable
    var isLoading :Boolean by bindingProperty(true)
    private set
    private  val topicPhotoFlow =topicPhotoUserCase.getTopicPhoto(
        onSuccess = {isLoading =true }
    )
    @get:Bindable
    val topicPhoto : List<TopicPhoto> by topicPhotoFlow.asBindingProperty(viewModelScope, emptyList())


}