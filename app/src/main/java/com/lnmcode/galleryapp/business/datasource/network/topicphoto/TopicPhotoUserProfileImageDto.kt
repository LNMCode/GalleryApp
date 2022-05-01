package com.lnmcode.galleryapp.business.datasource.network.topicphoto

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhotoUserProfileImage

data class TopicPhotoUserProfileImageDto(
    @SerializedName("small"  ) val small  : String,
    @SerializedName("medium" ) val medium : String,
    @SerializedName("large"  ) val large  : String
)
fun  TopicPhotoUserProfileImageDto.toTopicPhotoUserProfileImage() :TopicPhotoUserProfileImage{
    return TopicPhotoUserProfileImage(
        small=small,
        medium=medium,
        large=large
    )
}