package com.lnmcode.galleryapp.business.domain.models.topics

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicsUsers(
    val id: String,
    val updatedAt: String,
    val username: String,
    val name: String,
    val firstName: String,
    val lastName: String,
    val twitterUsername: String,
    val portfolioUrl: String,
    val bio: String,
    val location: String,
    val topicsUserLinks: TopicsUserLinks,
    val topicsUserProfileImage: TopicsUserProfileImage,
    val instagramUsername: String,
    val totalCollections: Int,
    val totalLikes: Int,
    val totalPhotos: Int,
    val acceptedTos: Boolean,
    val forHire: Boolean,
): Parcelable
