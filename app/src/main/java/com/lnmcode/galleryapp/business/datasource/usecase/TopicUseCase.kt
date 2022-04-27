package com.lnmcode.galleryapp.business.datasource.usecase
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepository
import com.lnmcode.galleryapp.business.datasource.network.topic.reponse.Topic
class TopicUseCase(private val topicApiRepository: TopicApiRepository) {
    suspend fun getTopics(id :String ,key: String): Topic {
        return topicApiRepository.topic(id =id ,key = key)
    }

}