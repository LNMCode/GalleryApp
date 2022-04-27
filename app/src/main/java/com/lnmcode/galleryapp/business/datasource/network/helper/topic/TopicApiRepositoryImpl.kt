package com.lnmcode.galleryapp.business.datasource.network.helper.topic

class TopicApiRepositoryImpl(private val topicApiService: TopicApiService) :TopicApiRepository {
    override suspend fun topic(id: String, key: String) = topicApiService.topicPhoto(id =id, key =key)
}