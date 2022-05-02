package com.lnmcode.galleryapp.business.domain.models.topics

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicsPreviewPhotos(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val blurHash: String,
    val TopicsPreviewPhotoUrls: TopicsPreviewPhotoUrls
): Parcelable
