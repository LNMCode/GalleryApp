package com.lnmcode.galleryapp.business.datasource.network.helper.topic

import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics

interface TopicApiRepository {
    suspend fun topic(
        id :String,
        key :String
    ) : Topics
}