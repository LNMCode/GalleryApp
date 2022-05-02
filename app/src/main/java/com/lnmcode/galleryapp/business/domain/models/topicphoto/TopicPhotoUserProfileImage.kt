package com.lnmcode.galleryapp.business.domain.models.topicphoto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicPhotoUserProfileImage(
    val small  : String,
    val medium : String,
    val large  : String
): Parcelable
