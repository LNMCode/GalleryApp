package com.lnmcode.galleryapp.business.domain.models.topicphoto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicPhotoLinks(
    val self             : String,
    val html             : String,
    val download         : String,
    val downloadLocation : String
): Parcelable
