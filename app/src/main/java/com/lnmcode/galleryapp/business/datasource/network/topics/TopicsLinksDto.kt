package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsLinks

data class TopicsLinksDto(
    @SerializedName("self"   ) val self   : String,
    @SerializedName("html"   ) val html   : String,
    @SerializedName("photos" ) val photos : String
)

fun TopicsLinksDto.toTopicsLink(): TopicsLinks {
    return TopicsLinks(
        self, html, photos
    )
}