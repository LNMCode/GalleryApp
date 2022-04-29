package com.lnmcode.galleryapp.business.datasource.network.topic.reponse

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topic.*
import com.lnmcode.galleryapp.business.domain.models.topic.Topic

data class TopicDto(
    @SerializedName("id"                             ) val id                          : String?,
    @SerializedName("slug"                           ) val slug                        : String?,
    @SerializedName("title"                          ) val title                       : String?,
    @SerializedName("description"                    ) val description                 : String?,
    @SerializedName("published_at"                   ) val publishedAt                 : String?,
    @SerializedName("updated_at"                     ) val updatedAt                   : String?,
    @SerializedName("starts_at"                      ) val startsAt                    : String?,
    @SerializedName("ends_at"                        ) val endsAt                      : String?,
    @SerializedName("only_submissions_after"         ) val onlySubmissionsAfter        : String?,
    @SerializedName("featured"                       ) val featured                    : Boolean?,
    @SerializedName("total_photos"                   ) val totalPhotos                 : Int?,
    @SerializedName("total_current_user_submissions" ) val totalCurrentUserSubmissions : String?,
    @SerializedName("links"                          ) val topicLinksDto               : TopicLinksDto?,
    @SerializedName("status"                         ) val status                      : String?,
    @SerializedName("owners"                         ) val  topicOwnersDto             : List<TopicOwnersDto>?,
    @SerializedName("top_contributors"               ) val topContributorsDto          : List<TopicTopContributorsDto>?,
    @SerializedName("cover_photo"                    ) val topicCoverPhotoDto          : TopicCoverPhotoDto?,
)
fun TopicDto.toTopicDomain() : Topic {
    return  Topic(
        id  = id,
        slug= slug,
        title =title,
        description =description ,
        publishedAt =publishedAt,
        updatedAt =updatedAt,
        startsAt =startsAt,
        endsAt =endsAt,
        onlySubmissionsAfter =onlySubmissionsAfter,
        featured=featured,
        totalPhotos=totalPhotos,
        totalCurrentUserSubmissions=totalCurrentUserSubmissions,
        topicLinks=topicLinksDto?.toTopicLinks(),
        status =status,
        topicOwners= topicOwnersDto?.map { it.toTopicOwners() },
        topContributors= topContributorsDto?.map { it.toTopicTopContributors() },
        topicCoverPhoto= topicCoverPhotoDto?.toTopicCoverPhoto()
    )

}
