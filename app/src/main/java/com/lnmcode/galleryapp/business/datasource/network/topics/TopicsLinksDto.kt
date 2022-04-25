package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName

data class TopicsLinksDto(
    @SerializedName("self"   ) val self   : String,
    @SerializedName("html"   ) val html   : String,
    @SerializedName("photos" ) val photos : String
)
