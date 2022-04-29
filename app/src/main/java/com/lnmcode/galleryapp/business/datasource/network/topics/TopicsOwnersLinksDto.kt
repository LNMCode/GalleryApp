package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsOwnersLinks

data class TopicsOwnersLinksDto(
    @SerializedName("self"      ) val self      : String,
    @SerializedName("html"      ) val html      : String,
    @SerializedName("photos"    ) val photos    : String,
    @SerializedName("likes"     ) val likes     : String,
    @SerializedName("portfolio" ) val portfolio : String,
    @SerializedName("following" ) val following : String,
    @SerializedName("followers" ) val followers : String
)

fun TopicsOwnersLinksDto.toTopicsOwnersLinks(): TopicsOwnersLinks {
    return TopicsOwnersLinks(
        self = self,
        html, photos, likes, portfolio, following, followers
    )
}