package com.lnmcode.galleryapp.business.datasource.usecase
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepository
import com.lnmcode.galleryapp.business.domain.models.topics.Topics

class TopicUseCase(private val topicApiRepository: TopicApiRepository) {
    suspend fun getTopics(id :String ,key: String): Topics {
        return topicApiRepository.topic(id =id ,key = key)
    }

}