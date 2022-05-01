package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicOwnersProfileImage

data class TopicOwnersProfileImageDto(
    @SerializedName("small"  ) val small  : String?,
    @SerializedName("medium" ) val medium : String?,
    @SerializedName("large"  ) val large  : String?
)
fun TopicOwnersProfileImageDto.toTopicOwnersProfileImage() : TopicOwnersProfileImage {
    return TopicOwnersProfileImage(
        small=small, medium=medium, large=large
    )
}
