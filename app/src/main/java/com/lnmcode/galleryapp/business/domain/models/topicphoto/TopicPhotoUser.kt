package com.lnmcode.galleryapp.business.domain.models.topicphoto

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.TopicPhotoUserLinksDto
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.TopicPhotoUserProfileImageDto

data class TopicPhotoUser(
    val id : String,
    val updatedAt  : String,
    val username : String,
    val name : String,
    val firstName : String,
    val lastName : String,
//    val portfolioUrl: String,
    val bio : String,
    val location  : String,
    val topicPhotoUserLinks : TopicPhotoUserLinks,
    val topicPhotoUserprofileImage : TopicPhotoUserProfileImage,
    val instagramUsername : String,
    val totalCollections  : Int,
    val totalLikes : Int,
    val totalPhotos : Int,
    val acceptedTos : Boolean,
    val forHire : Boolean,
)
