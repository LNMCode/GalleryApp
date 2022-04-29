package com.lnmcode.galleryapp.business.datasource.network.topics

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsCoverPhoto
import com.lnmcode.galleryapp.business.domain.models.topics.TopicsUsers

data class TopicsCoverPhotoDto(
    @SerializedName("id"                       ) val id                     : String,
    @SerializedName("created_at"               ) val createdAt              : String,
    @SerializedName("updated_at"               ) val updatedAt              : String,
    @SerializedName("promoted_at"              ) val promotedAt             : String?,
    @SerializedName("width"                    ) val width                  : Int,
    @SerializedName("height"                   ) val height                 : Int,
    @SerializedName("color"                    ) val color                  : String,
    @SerializedName("blur_hash"                ) val blurHash               : String,
    @SerializedName("description"              ) val description            : String?,
    @SerializedName("alt_description"          ) val altDescription         : String?,
    @SerializedName("urls"                     ) val topicsCoverPhotoUrlsDto   : TopicsCoverPhotoUrlsDto,
    @SerializedName("links"                    ) val topicsCoverPhotoLinksDto  : TopicsCoverPhotoLinksDto,
    @SerializedName("likes"                    ) val likes                  : Int?,
    @SerializedName("liked_by_user"            ) val likedByUser            : Boolean,
    @SerializedName("sponsorship"              ) val sponsorship            : String?,
    @SerializedName("user"                     ) val topicsUser              : TopicsUsers
)

fun TopicsCoverPhotoDto.toTopicsCoverPhoto() : TopicsCoverPhoto {
    return TopicsCoverPhoto(
        id = id,
        createdAt = createdAt,
        updatedAt = updatedAt,
        promotedAt = promotedAt,
        width = width,
        height = height,
        color = color,
        blurHash = blurHash,
        description = description,
        altDescription = altDescription,
        topicsCoverPhotoLinks = topicsCoverPhotoLinksDto.toTopicsCoverPhotoLinks(),
        topicsCoverPhotoUrls = topicsCoverPhotoUrlsDto.toTopicsCoverPhotoUrlsDto(),
        likes = likes,
        likedByUser = likedByUser,
        sponsorship = sponsorship,
        topicsUser = topicsUser,
    )
}
