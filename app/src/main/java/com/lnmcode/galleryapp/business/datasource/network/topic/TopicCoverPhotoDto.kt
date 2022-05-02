package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicCoverPhoto

data class TopicCoverPhotoDto(
    @SerializedName("id"                       ) val id                     : String?,
    @SerializedName("created_at"               ) val createdAt              : String?,
    @SerializedName("updated_at"               ) val updatedAt              : String?,
    @SerializedName("promoted_at"              ) val promotedAt             : String?,
    @SerializedName("width"                    ) val width                  : Int?,
    @SerializedName("height"                   ) val height                 : Int?,
    @SerializedName("color"                    ) val color                  : String?,
    @SerializedName("blur_hash"                ) val blurHash               : String?,
    @SerializedName("description"              ) val description            : String?,
    @SerializedName("alt_description"          ) val altDescription         : String?,
    @SerializedName("urls"                     ) val topicCoverPhotoDto     : TopicCoverPhotoDto?,
    @SerializedName("links"                    ) val  topicCoverUrlsDto     : TopicCoverUrlsDto?,
    @SerializedName("likes"                    ) val likes                  : Int?,
    @SerializedName("liked_by_user"            ) val likedByUser            : Boolean?,
    @SerializedName("sponsorship"              ) val sponsorship            : String?,
    @SerializedName("user"                     ) val topicUserDto           : TopicUserDto?
)
fun TopicCoverPhotoDto.toTopicCoverPhoto() : TopicCoverPhoto{
    return  TopicCoverPhoto(
        id=id,
        createdAt=createdAt,
        updatedAt= updatedAt,
        promotedAt= promotedAt,
        width=width,
        height= height,
        color= color,
        blurHash= blurHash,
        description= description,
        altDescription= altDescription,
        topicCoverPhoto =topicCoverPhotoDto?.toTopicCoverPhoto() ,
        topicCoverUrls =topicCoverUrlsDto?.toTopicCoverUrls(),
        likes= likes,
        likedByUser= likedByUser,
        sponsorship= sponsorship,
        topicUser = topicUserDto?.toTopicUser()
    )
}
