package com.lnmcode.galleryapp.business.domain.models.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicCoverPhotoDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicCoverUrlsDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicUserDto

data class TopicCoverPhoto (
    val id                     : String?,
    val createdAt              : String?,
    val updatedAt              : String?,
    val promotedAt             : String?,
    val width                  : Int?,
    val height                 : Int?,
    val color                  : String?,
    val blurHash               : String?,
    val description            : String?,
    val altDescription         : String?,
    val topicCoverPhoto        : TopicCoverPhoto?,
    val  topicCoverUrls        : TopicCoverUrls?,
    val likes                  : Int?,
    val likedByUser            : Boolean?,
    val sponsorship            : String?,
    val topicUser           : TopicUser?
)