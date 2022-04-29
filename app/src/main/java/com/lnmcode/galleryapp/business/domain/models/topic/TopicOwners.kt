package com.lnmcode.galleryapp.business.domain.models.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicOwnersLinksDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicOwnersProfileImageDto

data class TopicOwners(
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
    val topicOwnersLinks : TopicOwnersLinks?,
    val topicOwnersProfileImage: TopicOwnersProfileImage?,
    val instagramUsername : String?,
    val totalCollections  : Int?,
    val totalLikes        : Int?,
    val totalPhotos       : Int?,
    val acceptedTos       : Boolean?,
    val forHire           : Boolean?,
)
