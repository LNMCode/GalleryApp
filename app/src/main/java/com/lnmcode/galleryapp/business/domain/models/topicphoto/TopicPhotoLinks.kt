package com.lnmcode.galleryapp.business.domain.models.topicphoto

import com.google.gson.annotations.SerializedName

data class TopicPhotoLinks(
    val self             : String,
    val html             : String,
    val download         : String,
    val downloadLocation : String
)
