package com.lnmcode.galleryapp.business.datasource.network.topics.respose

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topics.TopicsCoverPhotoDto
import com.lnmcode.galleryapp.business.datasource.network.topics.TopicsLinksDto
import com.lnmcode.galleryapp.business.datasource.network.topics.TopicsOwnersDto
import com.lnmcode.galleryapp.business.datasource.network.topics.TopicsPreviewPhotosDto

data class Topics(
    @SerializedName("id"                             ) val id                          : String,
    @SerializedName("slug"                           ) val slug                        : String,
    @SerializedName("title"                          ) val title                       : String,
    @SerializedName("description"                    ) val description                 : String,
    @SerializedName("published_at"                   ) val publishedAt                 : String,
    @SerializedName("updated_at"                     ) val updatedAt                   : String,
    @SerializedName("starts_at"                      ) val startsAt                    : String,
    @SerializedName("ends_at"                        ) val endsAt                      : String,
    @SerializedName("only_submissions_after"         ) val onlySubmissionsAfter        : String,
    @SerializedName("featured"                       ) val featured                    : Boolean,
    @SerializedName("total_photos"                   ) val totalPhotos                 : Int,
    @SerializedName("total_current_user_submissions" ) val totalCurrentUserSubmissions : String,
    @SerializedName("links"                          ) val topicsLinkDto               : TopicsLinksDto,
    @SerializedName("status"                         ) val status                      : String,
    @SerializedName("owners"                         ) val topicsOwnersDto             : ArrayList<TopicsOwnersDto>,
    @SerializedName("cover_photo"                    ) val topicsCoverPhoto            :TopicsCoverPhotoDto?,
    @SerializedName("preview_photos"                 ) val topicsPreviewPhotosDto      : ArrayList<TopicsPreviewPhotosDto>
)
