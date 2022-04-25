package com.lnmcode.galleryapp.business.datasource.network.search

import com.google.gson.annotations.SerializedName

data class SearchUserProfileImageDto(
    @SerializedName("small"  ) val small  : String,
    @SerializedName("medium" ) val medium : String,
    @SerializedName("large"  ) val large  : String
)
