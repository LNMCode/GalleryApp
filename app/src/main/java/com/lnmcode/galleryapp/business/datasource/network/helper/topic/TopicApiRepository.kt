package com.lnmcode.galleryapp.business.datasource.network.helper.topic

import com.lnmcode.galleryapp.business.datasource.network.topic.reponse.Topic
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhoto

interface TopicApiRepository {
    suspend fun topic(
        id :String,
        key :String
    ) : Topic
}