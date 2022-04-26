package com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto

import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhoto


interface TopicPhotoIApiRepository {
    suspend fun topicPhoto(
        id :String,
        key :String
    ) : List<TopicPhoto>
}