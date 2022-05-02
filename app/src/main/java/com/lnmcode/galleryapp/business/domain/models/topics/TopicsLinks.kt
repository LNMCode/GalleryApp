package com.lnmcode.galleryapp.business.domain.models.topics

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicsLinks(
    val self: String,
    val html: String,
    val photos: String
): Parcelable
