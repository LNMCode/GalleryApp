package com.lnmcode.galleryapp.business.datasource.network.topicphoto

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhotoUser


data class TopicPhotoUserDto(
    @SerializedName("id") val id : String,
    @SerializedName("updated_at") val updatedAt  : String,
    @SerializedName("username") val username : String,
    @SerializedName("name") val name : String,
    @SerializedName("first_name") val firstName : String,
    @SerializedName("last_name") val lastName : String?,
//    @SerializedName("portfolio_url") val portfolioUrl: String,
    @SerializedName("bio") val bio : String?,
    @SerializedName("location") val location  : String?,
    @SerializedName("links") val topicPhotoUserLinksDto : TopicPhotoUserLinksDto,
    @SerializedName("profile_image") val topicPhotoUserprofileImageDto : TopicPhotoUserProfileImageDto,
    @SerializedName("instagram_username") val instagramUsername : String?,
    @SerializedName("total_collections") val totalCollections  : Int,
    @SerializedName("total_likes") val totalLikes : Int,
    @SerializedName("total_photos") val totalPhotos : Int,
    @SerializedName("accepted_tos") val acceptedTos : Boolean,
    @SerializedName("for_hire") val forHire : Boolean,

    )
fun TopicPhotoUserDto.toTopicPhotoUser() :TopicPhotoUser{
    return TopicPhotoUser(
        id=id,
        updatedAt=updatedAt,
        username=username,
        name=name,
        firstName=firstName,
        lastName=lastName,
//        portfolioUrl= portfolioUrl,
        bio=bio,
        location=location,
        topicPhotoUserLinks = topicPhotoUserLinksDto.toTopicPhotoUserLinks(),
        topicPhotoUserprofileImage = topicPhotoUserprofileImageDto.toTopicPhotoUserProfileImage(),
        instagramUsername = instagramUsername,
        totalCollections = totalCollections,
        totalLikes =totalLikes,
        totalPhotos =totalPhotos,
        acceptedTos =acceptedTos,
        forHire =forHire

    )
}
