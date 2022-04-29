package com.lnmcode.galleryapp.business.domain.models.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicCoverPhotoDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicLinksDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicOwnersDto
import com.lnmcode.galleryapp.business.datasource.network.topic.TopicTopContributorsDto

data class Topic(
   val id                          : String?,
   val slug                        : String?,
   val title                       : String?,
   val description                 : String?,
   val publishedAt                 : String?,
   val updatedAt                   : String?,
   val startsAt                    : String?,
   val endsAt                      : String?,
   val onlySubmissionsAfter        : String?,
   val featured                    : Boolean?,
   val totalPhotos                 : Int?,
   val totalCurrentUserSubmissions : String?,
   val topicLinks               : TopicLinks?,
   val status                      : String?,
   val topicOwners              : List<TopicOwners>?,
   val topContributors          : List<TopicTopContributors>?,
   val topicCoverPhoto          : TopicCoverPhoto?,
   )
