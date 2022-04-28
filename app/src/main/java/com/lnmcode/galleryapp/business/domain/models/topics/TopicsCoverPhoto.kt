package com.lnmcode.galleryapp.business.domain.models.topics

data class TopicsCoverPhoto(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val promotedAt: String,
    val width: Int,
    val height: Int,
    val color: String,
    val blurHash: String,
    val description: String,
    val altDescription: String,
    val topicsCoverPhotoUrls: TopicsCoverPhotoUrls,
    val topicsCoverPhotoLinks: TopicsCoverPhotoLinks,
    val likes: Int?,
    val likedByUser: Boolean,
    val sponsorship: String?,
    val topicsUser: TopicsUsers
)
