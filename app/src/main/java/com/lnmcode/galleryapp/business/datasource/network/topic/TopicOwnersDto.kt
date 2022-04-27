package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName

data class TopicOwnersDto(
    @SerializedName("id"                 ) val id                : String,
    @SerializedName("updated_at"         ) val updatedAt         : String,
    @SerializedName("username"           ) val username          : String,
    @SerializedName("name"               ) val name              : String,
    @SerializedName("first_name"         ) val firstName         : String,
    @SerializedName("last_name"          ) val lastName          : String,
    @SerializedName("twitter_username"   ) val twitterUsername   : String,
    @SerializedName("portfolio_url"      ) val portfolioUrl      : String,
    @SerializedName("bio"                ) val bio               : String,
    @SerializedName("location"           ) val location          : String,
    @SerializedName("links"              ) val topicOwnersLinksDto : TopicOwnersLinksDto           ,
    @SerializedName("profile_image"      ) val topicOwnersProfileImageDto: TopicOwnersProfileImageDto,
    @SerializedName("instagram_username" ) val instagramUsername : String,
    @SerializedName("total_collections"  ) val totalCollections  : Int,
    @SerializedName("total_likes"        ) val totalLikes        : Int,
    @SerializedName("total_photos"       ) val totalPhotos       : Int,
    @SerializedName("accepted_tos"       ) val acceptedTos       : Boolean,
    @SerializedName("for_hire"           ) val forHire           : Boolean,

)
