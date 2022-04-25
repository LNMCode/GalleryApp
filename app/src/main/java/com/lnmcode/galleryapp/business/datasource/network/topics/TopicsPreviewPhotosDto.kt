package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName

data class TopicsPreviewPhotosDto(
    @SerializedName("id"         ) val id        : String,
    @SerializedName("created_at" ) val createdAt : String,
    @SerializedName("updated_at" ) val updatedAt : String,
    @SerializedName("blur_hash"  ) val blurHash  : String,
    @SerializedName("urls"       ) val TopicsPreviewPhotoUrls    : TopicsPreviewPhotoUrlsDto

)
