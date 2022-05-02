package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsOwnersProfileImage

data class TopicsOwnersProfileImageDto (
    @SerializedName("small"  ) val small  : String,
    @SerializedName("medium" ) val medium : String,
    @SerializedName("large"  ) val large  : String
        )

fun TopicsOwnersProfileImageDto.toTopicsOwnersProfileImage(): TopicsOwnersProfileImage {
    return TopicsOwnersProfileImage(
        small, medium, large
    )
}