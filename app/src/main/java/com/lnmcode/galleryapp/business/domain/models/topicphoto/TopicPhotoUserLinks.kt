package com.lnmcode.galleryapp.business.domain.models.topicphoto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicPhotoUserLinks(
    val self      : String,
    val html      : String,
    val photos    : String,
    val likes     : String?,
    val portfolio : String?,
    val following : String,
    val followers : String
): Parcelable
