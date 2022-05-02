package com.lnmcode.galleryapp.business.datasource.network.topicphoto

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhotoUserLinks

data class TopicPhotoUserLinksDto (
    @SerializedName("self"      ) val self      : String,
    @SerializedName("html"      ) val html      : String,
    @SerializedName("photos"    ) val photos    : String,
    @SerializedName("likes"     ) val likes     : String?,
    @SerializedName("portfolio" ) val portfolio : String,
    @SerializedName("following" ) val following : String,
    @SerializedName("followers" ) val followers : String
 )
fun TopicPhotoUserLinksDto.toTopicPhotoUserLinks() :TopicPhotoUserLinks{
    return  TopicPhotoUserLinks(
        self=self,
        html=html,
        photos=photos,
        likes=likes,
        portfolio=portfolio,
        following=following,
        followers=followers
    )
}
