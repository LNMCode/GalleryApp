package com.lnmcode.galleryapp.business.datasource.usecase

import com.lnmcode.galleryapp.business.datasource.cache.helper.TopicsCacheRepository
import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsEntities

class TopicsCacheUseCase(
    private val topicsCacheRepository: TopicsCacheRepository,
) {
    suspend fun getTopics(): List<TopicsEntities> {
        return topicsCacheRepository.getTopics()
    }

    suspend fun getTopicsFromId(id: String): TopicsEntities {
        return topicsCacheRepository.getTopicsFromId(id)
    }

    suspend fun insertAndReplace(
        topicsEntities: TopicsEntities
    ): Long {
        return topicsCacheRepository.insertAndReplace(topicsEntities)
    }
}