package com.lnmcode.galleryapp.business.domain.models.topic

import com.google.gson.annotations.SerializedName

data class TopicOwnersLinks(
    val self      : String?,
    val html      : String?,
    val photos    : String?,
    val likes     : String?,
    val portfolio : String?,
    val following : String?,
    val followers : String?
)
