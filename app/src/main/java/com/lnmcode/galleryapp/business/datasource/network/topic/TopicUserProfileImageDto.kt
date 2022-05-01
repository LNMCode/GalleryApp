package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicUserProfileImage

data class TopicUserProfileImageDto (
    @SerializedName("small"  ) val small  : String?,
    @SerializedName("medium" ) val medium : String?,
    @SerializedName("large"  ) val large  : String?
)
fun TopicUserProfileImageDto.toTopicUserProfileImage() :TopicUserProfileImage{
    return TopicUserProfileImage(
        small=small, medium=medium, large=large
    )
}
