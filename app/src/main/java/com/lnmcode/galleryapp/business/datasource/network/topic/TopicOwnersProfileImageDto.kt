package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName

data class TopicOwnersProfileImageDto(
    @SerializedName("small"  ) val small  : String,
    @SerializedName("medium" ) val medium : String,
    @SerializedName("large"  ) val large  : String
)
