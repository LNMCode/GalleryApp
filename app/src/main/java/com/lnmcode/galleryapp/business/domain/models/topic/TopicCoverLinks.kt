package com.lnmcode.galleryapp.business.domain.models.topic

import com.google.gson.annotations.SerializedName

data class TopicCoverLinks(
        val self             : String?,
        val html             : String?,
        val download         : String?,
        val downloadLocation : String?
)
