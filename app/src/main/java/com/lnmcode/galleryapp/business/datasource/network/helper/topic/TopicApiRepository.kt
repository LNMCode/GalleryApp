package com.lnmcode.galleryapp.business.datasource.network.helper.topic

import com.lnmcode.galleryapp.business.datasource.network.topic.reponse.TopicDto


interface TopicApiRepository {
    suspend fun topic(
        id :String,
        key :String
    ) : TopicDto
}