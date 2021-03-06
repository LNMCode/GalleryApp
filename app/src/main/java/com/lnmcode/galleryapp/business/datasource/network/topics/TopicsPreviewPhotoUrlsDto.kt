package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsPreviewPhotoUrls

data class TopicsPreviewPhotoUrlsDto (
    @SerializedName("raw"      ) val raw     : String,
    @SerializedName("full"     ) val full    : String,
    @SerializedName("regular"  ) val regular : String,
    @SerializedName("small"    ) val small   : String,
    @SerializedName("thumb"    ) val thumb   : String,
    @SerializedName("small_s3" ) val smallS3 : String
        )

fun TopicsPreviewPhotoUrlsDto.toTopicsPreviewPhotoUrls(): TopicsPreviewPhotoUrls {
    return TopicsPreviewPhotoUrls(
        raw, full, regular, small, thumb, smallS3
    )
}