package com.lnmcode.galleryapp.business.domain.models.topics

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicsCoverPhotoLinks(
    val self: String,
    val html: String,
    val download: String,
    val downloadLocation: String
): Parcelable