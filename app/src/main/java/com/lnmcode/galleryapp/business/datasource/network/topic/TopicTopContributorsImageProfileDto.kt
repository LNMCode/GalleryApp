package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName

data class TopicTopContributorsImageProfileDto(

    @SerializedName("small"  ) val small  : String? = null,
    @SerializedName("medium" ) val medium : String? = null,
    @SerializedName("large"  ) val large  : String? = null
)
