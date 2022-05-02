package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsUserLinks

data class TopicsUserLinksDto(
    @SerializedName("self"      ) val self      : String,
    @SerializedName("html"      ) val html      : String,
    @SerializedName("photos"    ) val photos    : String,
    @SerializedName("likes"     ) val likes     : String,
    @SerializedName("portfolio" ) val portfolio : String,
    @SerializedName("following" ) val following : String,
    @SerializedName("followers" ) val followers : String,

)

fun TopicsUserLinksDto.toTopicsUserLinks(): TopicsUserLinks {
    return TopicsUserLinks(
       self, html, photos, likes, portfolio, following, followers
    )
}
