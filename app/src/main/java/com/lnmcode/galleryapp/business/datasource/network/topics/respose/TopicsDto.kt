package com.lnmcode.galleryapp.business.datasource.network.topics.respose

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topics.*
import com.lnmcode.galleryapp.business.domain.models.topics.Topics

data class TopicsDto(
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
    @SerializedName("total_current_user_submissions" ) val totalCurrentUserSubmissions : String?,
    @SerializedName("links"                          ) val topicsLinkDto               : TopicsLinksDto,
    @SerializedName("status"                         ) val status                      : String,
    @SerializedName("owners"                         ) val topicsOwnersDto             : List<TopicsOwnersDto>,
    @SerializedName("cover_photo"                    ) val topicsCoverPhotoDto            : TopicsCoverPhotoDto?,
    @SerializedName("preview_photos"                 ) val topicsPreviewPhotosDto      : List<TopicsPreviewPhotosDto>
)

fun TopicsDto.toTopicsDomain(): Topics {
    return Topics(
        id = id,
        slug = slug,
        title = title,
        description = description,
        publishedAt = publishedAt,
        updatedAt = updatedAt,
        startsAt = startsAt,
        endsAt = endsAt,
        onlySubmissionsAfter = onlySubmissionsAfter,
        featured = featured,
        totalPhotos = totalPhotos,
        totalCurrentUserSubmissions = totalCurrentUserSubmissions,
        topicsLinkDto = topicsLinkDto.toTopicsLink(),
        status = status,
        topicsOwners = topicsOwnersDto.map { it.toTopicsOwners() },
        topicsCoverPhoto = topicsCoverPhotoDto?.toTopicsCoverPhoto(),
        topicsPreviewPhotos = topicsPreviewPhotosDto.map { it.toTopicsPreviewPhotos() },
    )
}