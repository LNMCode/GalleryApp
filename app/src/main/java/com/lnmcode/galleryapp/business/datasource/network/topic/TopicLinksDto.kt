package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicLinks

data class TopicLinksDto (
    @SerializedName("self"   ) val self   : String?,
    @SerializedName("html"   ) val html   : String?,
    @SerializedName("photos" ) val photos : String?
    )
fun TopicLinksDto.toTopicLinks() :TopicLinks{
    return TopicLinks(
        self=self,
        html =html,
        photos =photos
    )
}