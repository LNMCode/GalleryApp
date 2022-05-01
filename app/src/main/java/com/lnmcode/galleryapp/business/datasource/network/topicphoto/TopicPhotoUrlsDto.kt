package com.lnmcode.galleryapp.business.datasource.network.topicphoto

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhotoUrls

data class TopicPhotoUrlsDto(
    @SerializedName("raw") val raw     : String,
    @SerializedName("full") val full    : String,
    @SerializedName("regular") val regular : String,
    @SerializedName("small") val small   : String,
    @SerializedName("thumb") val thumb   : String,
    @SerializedName("small_s3") val smallS3 : String
)
fun  TopicPhotoUrlsDto.toTopicPhotoUrls() :TopicPhotoUrls{
    return  TopicPhotoUrls(
        raw=raw,
        full=full,
        regular=regular,
        small=small,
        thumb=thumb,
        smallS3=smallS3
    )
}
