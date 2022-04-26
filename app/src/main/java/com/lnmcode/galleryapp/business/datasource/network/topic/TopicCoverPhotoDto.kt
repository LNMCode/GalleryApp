package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName

data class TopicCoverPhotoDto(
    @SerializedName("id"                       ) var id                     : String?           = null,
    @SerializedName("created_at"               ) var createdAt              : String?           = null,
    @SerializedName("updated_at"               ) var updatedAt              : String?           = null,
    @SerializedName("promoted_at"              ) var promotedAt             : String?           = null,
    @SerializedName("width"                    ) var width                  : Int?              = null,
    @SerializedName("height"                   ) var height                 : Int?              = null,
    @SerializedName("color"                    ) var color                  : String?           = null,
    @SerializedName("blur_hash"                ) var blurHash               : String?           = null,
    @SerializedName("description"              ) var description            : String?           = null,
    @SerializedName("alt_description"          ) var altDescription         : String?           = null,
    @SerializedName("urls"                     ) var topicCoverPhotoDto: TopicCoverPhotoDto,
    @SerializedName("links"                    ) var  topicCoverUrlsDto: TopicCoverUrlsDto,
    @SerializedName("categories"               ) var categories             : ArrayList<String> = arrayListOf(),
    @SerializedName("likes"                    ) var likes                  : Int?              = null,
    @SerializedName("liked_by_user"            ) var likedByUser            : Boolean?          = null,
    @SerializedName("current_user_collections" ) var currentUserCollections : ArrayList<String> = arrayListOf(),
    @SerializedName("sponsorship"              ) var sponsorship            : String?           = null,
    @SerializedName("user"                     ) var topicUserDto: TopicUserDto
)
