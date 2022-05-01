package com.lnmcode.galleryapp.business.domain.models.topicphoto
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.TopicPhotoLinksDto
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.TopicPhotoUrlsDto
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.TopicPhotoUserDto

data class TopicPhoto(
    val id: String?,
    val createdAt : String?,
    val updatedAt : String?,
    val promotedAt : String?,
    val width: Int,
    val height: Int,
    val color : String,
    val blurHash: String,
//    val description: String,
//    val altDescription: String,
    val topicPhotoUrls : TopicPhotoUrls,
    val topicPhotoLinks : TopicPhotoLinks,
    val likes: Int,
    val likedByUser: Boolean,
    val sponsorship: String?,
    val topicPhotoUser: TopicPhotoUser
)

