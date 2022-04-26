package com.lnmcode.galleryapp.business.datasource.usecase

import com.lnmcode.galleryapp.business.datasource.network.helper.topics.TopicsIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics

class TopicsUseCase(private val topicsIApiRepository: TopicsIApiRepository) {
    suspend fun getTopics(key: String): Topics {
        return topicsIApiRepository.topics(key = key)
    }

}