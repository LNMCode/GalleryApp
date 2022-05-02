package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicCoverLinks
import com.lnmcode.galleryapp.business.domain.models.topic.TopicCoverPhoto

data class TopicCoverLinksDto(
    @SerializedName("self"              ) val self             : String?,
    @SerializedName("html"              ) val html             : String?,
    @SerializedName("download"          ) val download         : String?,
    @SerializedName("download_location" ) val downloadLocation : String?
)
fun  TopicCoverLinksDto.toTopicCoverLinks() : TopicCoverLinks {
    return TopicCoverLinks(
        self=self,
        html= html,
        download=download,
        downloadLocation=downloadLocation
    )
}
