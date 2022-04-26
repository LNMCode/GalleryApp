package com.lnmcode.galleryapp.business.datasource.network.topicphoto

import com.google.gson.annotations.SerializedName

data class TopicPhotoLinksDto (
    @SerializedName("self"              ) val self             : String,
    @SerializedName("html"              ) val html             : String,
    @SerializedName("download"          ) val download         : String,
    @SerializedName("download_location" ) val downloadLocation : String
)