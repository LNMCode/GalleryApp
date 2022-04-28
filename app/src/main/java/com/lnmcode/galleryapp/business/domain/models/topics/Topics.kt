package com.lnmcode.galleryapp.business.domain.models.topics

data class Topics(
    val id: String,
    val slug: String,
    val title: String,
    val description: String,
    val publishedAt: String,
    val updatedAt: String,
    val startsAt: String,
    val endsAt: String,
    val onlySubmissionsAfter: String,
    val featured: Boolean,
    val totalPhotos: Int,
    val totalCurrentUserSubmissions: String?,
    val topicsLinkDto: TopicsLinks,
    val status: String,
    val topicsOwners: List<TopicsOwners>,
    val topicsCoverPhoto: TopicsCoverPhoto?,
    val topicsPreviewPhotos: List<TopicsPreviewPhotos>
)
