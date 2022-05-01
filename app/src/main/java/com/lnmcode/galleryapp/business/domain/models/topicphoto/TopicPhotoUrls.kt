package com.lnmcode.galleryapp.business.domain.models.topicphoto

import com.google.gson.annotations.SerializedName

data class TopicPhotoUrls(
    val raw     : String,
    val full    : String,
    val regular : String,
    val small   : String,
    val thumb   : String,
    val smallS3 : String
)
