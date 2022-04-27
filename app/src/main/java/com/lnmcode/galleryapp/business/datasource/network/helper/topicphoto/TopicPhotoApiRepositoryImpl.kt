package com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto



class TopicPhotoApiRepositoryImpl(private val topicApiService: TopicPhotoApiService) : TopicPhotoIApiRepository {
    override suspend fun topicPhoto(key: String,id :String) = topicApiService.topicPhoto(id =id,key = key)
}