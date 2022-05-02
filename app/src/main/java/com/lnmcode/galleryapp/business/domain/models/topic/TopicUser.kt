package com.lnmcode.galleryapp.business.domain.models.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicUserLinksDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicUserProfileImageDto

data class TopicUser(
    val id                : String?,
    val updatedAt         : String?,
    val username          : String?,
    val name              : String?,
    val firstName         : String?,
    val lastName          : String?,
    val twitterUsername   : String?,
    val portfolioUrl      : String?,
    val bio               : String?,
    val location          : String?,
    val topicUserLinks: TopicUserLinks?,
    val topicUserProfileImage: TopicUserProfileImage?,
    val instagramUsername : String?,
    val totalCollections  : Int?,
    val totalLikes        : Int?,
    val totalPhotos       : Int?,
    val acceptedTos       : Boolean?,
    val forHire           : Boolean?,
)
