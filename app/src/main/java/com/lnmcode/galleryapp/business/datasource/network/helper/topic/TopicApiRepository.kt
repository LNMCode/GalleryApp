package com.lnmcode.galleryapp.business.datasource.network.helper.topic

import com.lnmcode.galleryapp.business.domain.models.topics.Topics

interface TopicApiRepository {
    suspend fun topic(
        id :String,
        key :String
    ) : Topics
}