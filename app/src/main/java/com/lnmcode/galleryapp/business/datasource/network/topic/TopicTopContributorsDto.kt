package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName

data class TopicTopContributorsDto(
    @SerializedName("id"                 ) val id                : String?       = null,
    @SerializedName("updated_at"         ) val updatedAt         : String?       = null,
    @SerializedName("username"           ) val username          : String?       = null,
    @SerializedName("name"               ) val name              : String?       = null,
    @SerializedName("first_name"         ) val firstName         : String?       = null,
    @SerializedName("last_name"          ) val lastName          : String?       = null,
    @SerializedName("twitter_username"   ) val twitterUsername   : String?       = null,
    @SerializedName("portfolio_url"      ) val portfolioUrl      : String?       = null,
    @SerializedName("bio"                ) val bio               : String?       = null,
    @SerializedName("location"           ) val location          : String?       = null,
    @SerializedName("links"              ) val topicTopContributorsLinksDto: TopicTopContributorsLinksDto,
    @SerializedName("profile_image"      ) val  topicTopContributorsImageProfileDto: TopicTopContributorsImageProfileDto,
    @SerializedName("instagram_username" ) val instagramUsername : String?       = null,
    @SerializedName("total_collections"  ) val totalCollections  : Int?          = null,
    @SerializedName("total_likes"        ) val totalLikes        : Int?          = null,
    @SerializedName("total_photos"       ) val totalPhotos       : Int?          = null,
    @SerializedName("accepted_tos"       ) val acceptedTos       : Boolean?      = null,
    @SerializedName("for_hire"           ) val forHire           : Boolean?      = null,

)
