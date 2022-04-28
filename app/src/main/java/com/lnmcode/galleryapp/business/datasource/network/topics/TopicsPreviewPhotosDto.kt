package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsPreviewPhotoUrls
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsPreviewPhotos

data class TopicsPreviewPhotosDto(
    @SerializedName("id"         ) val id        : String,
    @SerializedName("created_at" ) val createdAt : String,
    @SerializedName("updated_at" ) val updatedAt : String,
    @SerializedName("blur_hash"  ) val blurHash  : String,
    @SerializedName("urls"       ) val TopicsPreviewPhotoUrls    : TopicsPreviewPhotoUrls

)

fun TopicsPreviewPhotosDto.toTopicsPreviewPhotos(): TopicsPreviewPhotos {
    return TopicsPreviewPhotos(
        id, createdAt, updatedAt, blurHash, TopicsPreviewPhotoUrls
    )
}
