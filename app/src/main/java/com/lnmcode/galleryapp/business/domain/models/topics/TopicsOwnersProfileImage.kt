package com.lnmcode.galleryapp.business.domain.models.topics

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicsOwnersProfileImage(
    val small: String,
    val medium: String,
    val large: String
) :Parcelable
