package com.lnmcode.galleryapp.business.datasource.usecase
import com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto.TopicPhotoIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhoto

class TopicPhotoUseCase(private val topicIApiRepository: TopicPhotoIApiRepository) {
    suspend fun get(id :String, key :String) : List<TopicPhoto>{
        return  topicIApiRepository.topicPhoto(id = id,key=key)
    }
}