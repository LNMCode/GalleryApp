package com.lnmcode.galleryapp.business.datasource.network.topics
import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsCoverPhotoLinks

data class TopicsCoverPhotoLinksDto (
    @SerializedName("self"              ) val self             : String,
    @SerializedName("html"              ) val html             : String,
    @SerializedName("download"          ) val download         : String,
    @SerializedName("download_location" ) val downloadLocation : String
    )

fun TopicsCoverPhotoLinksDto.toTopicsCoverPhotoLinks(): TopicsCoverPhotoLinks {
    return TopicsCoverPhotoLinks(
        self, html, download, downloadLocation
    )
}