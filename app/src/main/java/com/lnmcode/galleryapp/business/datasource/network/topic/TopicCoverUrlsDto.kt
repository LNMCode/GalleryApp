package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicCoverPhoto
import com.lnmcode.galleryapp.business.domain.models.topic.TopicCoverUrls
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsUrls

data class TopicCoverUrlsDto(
    @SerializedName("raw"      ) val raw     : String?,
    @SerializedName("full"     ) val full    : String?,
    @SerializedName("regular"  ) val regular : String?,
    @SerializedName("small"    ) val small   : String?,
    @SerializedName("thumb"    ) val thumb   : String?,
    @SerializedName("small_s3" ) val smallS3 : String?
)
fun TopicCoverUrlsDto.toTopicCoverUrls() : TopicCoverUrls {
    return  TopicCoverUrls(
        raw=raw,
        full =full,
        regular= regular,
        small= small,
        thumb =thumb,
        smallS3= smallS3
    )
}
