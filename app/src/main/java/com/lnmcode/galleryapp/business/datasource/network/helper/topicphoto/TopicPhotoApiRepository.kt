package com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto

import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhotoResponse


interface TopicPhotoIApiRepository {
    suspend fun topicPhoto(
        id :String,
        key :String
    ) : List<TopicPhotoResponse>
}