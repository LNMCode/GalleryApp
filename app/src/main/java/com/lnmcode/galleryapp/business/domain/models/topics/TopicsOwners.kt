package com.lnmcode.galleryapp.business.domain.models.topics

data class TopicsOwners(
    val id: String,
    val updatedAt: String,
    val username: String,
    val name: String,
    val firstName: String,
    val lastName: String?,
    val twitterUsername: String,
    val portfolioUrl: String,
    val bio: String,
    val location: String,
    val topicsOwnerLinks: TopicsOwnersLinks,
    val topicsOwnerProfileImage: TopicsOwnersProfileImage,
    val instagramUsername: String,
    val totalCollections: Int,
    val totalLikes: Int,
    val totalPhotos: Int,
    val acceptedTos: Boolean,
    val forHire: Boolean,
)
