package com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.*
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto

data class TopicPhotoResponse(
    @SerializedName("id") val id: String?,
    @SerializedName("created_at") val createdAt : String?,
    @SerializedName("updated_at") val updatedAt : String?,
    @SerializedName("promoted_at")val promotedAt : String?,
    @SerializedName("width") val width: Int,
    @SerializedName("height") val height: Int,
    @SerializedName("color") val color : String,
    @SerializedName("blur_hash") val blurHash: String,
    @SerializedName("description") val description: String?,
    @SerializedName("alt_description") val altDescription: String?,
    @SerializedName("urls") val topicPhotoUrlsDto : TopicPhotoUrlsDto,
    @SerializedName("links") val topicPhotoLinksDto : TopicPhotoLinksDto,
    @SerializedName("likes") val likes: Int,
    @SerializedName("liked_by_user") val likedByUser: Boolean,
    @SerializedName("sponsorship") val sponsorship: String?,
    @SerializedName("user") val topicPhotoUserDto: TopicPhotoUserDto
)
fun TopicPhotoResponse.toTopicPhoto() : TopicPhoto{
    return  TopicPhoto(
        id=id,
        createdAt=createdAt,
        updatedAt=updatedAt,
        promotedAt=promotedAt,
        width=width,
        height=height,
        color=color,
        blurHash=blurHash,
        description=description,
        altDescription=altDescription,
        topicPhotoUrls =topicPhotoUrlsDto.toTopicPhotoUrls(),
        topicPhotoLinks =topicPhotoLinksDto.toTopicPhotoLinks(),
        likes= likes,
        likedByUser=likedByUser,
        sponsorship=sponsorship,
        topicPhotoUser=topicPhotoUserDto.toTopicPhotoUser()
    )
}
