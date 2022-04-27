package com.lnmcode.galleryapp.business.datasource.network.helper.topics

import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics

class TopicsApiRepositoryImpl(private val topicsApiService: TopicsApiService) :TopicsIApiRepository {
    override suspend fun topics(key: String) = topicsApiService.topics(key = key)
}