package com.lnmcode.galleryapp.business.datasource.network.search

import com.google.gson.annotations.SerializedName

data class SearchResultsDto(
    @SerializedName("id"                       ) val id                     : String,
    @SerializedName("created_at"               ) val createdAt              : String,
    @SerializedName("updated_at"               ) val updatedAt              : String,
    @SerializedName("promoted_at"              ) val promotedAt             : String,
    @SerializedName("width"                    ) val width                  : Int,
    @SerializedName("height"                   ) val height                 : Int,
    @SerializedName("color"                    ) val color                  : String,
    @SerializedName("blur_hash"                ) val blurHash               : String,
    @SerializedName("description"              ) val description            : String,
    @SerializedName("alt_description"          ) val altDescription         : String,
    @SerializedName("urls"                     ) val searchUrls             : SearchUrlsDto,
    @SerializedName("links"                    ) val links                  : SearchLinksDto,
    @SerializedName("likes"                    ) val likes                  : Int?,
    @SerializedName("liked_by_user"            ) val likedByUser            : Boolean,
    @SerializedName("sponsorship"              ) val sponsorship            : String,
    @SerializedName("user"                     ) val searchUser             : SearchUsersDto,
)
