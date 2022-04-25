package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName

data class TopicsOwnersProfileImageDto (
    @SerializedName("small"  ) val small  : String,
    @SerializedName("medium" ) val medium : String,
    @SerializedName("large"  ) val large  : String
        )
