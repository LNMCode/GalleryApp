package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicUser

data class TopicUserDto(
    @SerializedName("id"                 ) val id                : String?,
    @SerializedName("updated_at"         ) val updatedAt         : String?,
    @SerializedName("username"           ) val username          : String?,
    @SerializedName("name"               ) val name              : String?,
    @SerializedName("first_name"         ) val firstName         : String?,
    @SerializedName("last_name"          ) val lastName          : String?,
    @SerializedName("twitter_username"   ) val twitterUsername   : String?,
    @SerializedName("portfolio_url"      ) val portfolioUrl      : String?,
    @SerializedName("bio"                ) val bio               : String?,
    @SerializedName("location"           ) val location          : String?,
    @SerializedName("links"              ) val topicUserLinksDto : TopicUserLinksDto?  ,
    @SerializedName("profile_image"      ) val topicUserProfileImageDto: TopicUserProfileImageDto?,
    @SerializedName("instagram_username" ) val instagramUsername : String?,
    @SerializedName("total_collections"  ) val totalCollections  : Int?,
    @SerializedName("total_likes"        ) val totalLikes        : Int?,
    @SerializedName("total_photos"       ) val totalPhotos       : Int?,
    @SerializedName("accepted_tos"       ) val acceptedTos       : Boolean?,
    @SerializedName("for_hire"           ) val forHire           : Boolean?,
)
fun TopicUserDto.toTopicUser() :TopicUser{
    return  TopicUser(
        username=username,
        id=id,
        updatedAt=updatedAt,
        name =name,
        firstName = firstName,
        lastName = lastName,
        twitterUsername = twitterUsername,
        topicUserProfileImage = topicUserProfileImageDto?.toTopicUserProfileImage(),
        portfolioUrl = portfolioUrl,
        bio = bio,
        location = location,
        topicUserLinks = topicUserLinksDto?.toTopicUserLinks(),
        instagramUsername = instagramUsername,
        totalPhotos = totalPhotos,
        totalLikes = totalLikes,
        totalCollections = totalCollections,
        acceptedTos = acceptedTos,
        forHire = forHire





    )
}
