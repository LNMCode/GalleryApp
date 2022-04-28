package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsUserProfileImage

data class TopicsUserProfileImageDto(
    @SerializedName("small"  ) val small  : String,
    @SerializedName("medium" ) val medium : String,
    @SerializedName("large"  ) val large  : String

)

fun TopicsUserProfileImageDto.toTopicsUserProfileImage(): TopicsUserProfileImage {
    return TopicsUserProfileImage(
        small, medium, large
    )
}
