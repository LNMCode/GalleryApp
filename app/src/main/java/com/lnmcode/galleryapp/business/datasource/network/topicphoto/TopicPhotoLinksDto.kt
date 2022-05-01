package com.lnmcode.galleryapp.business.datasource.network.topicphoto

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhotoLinks
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhotoUserProfileImage

data class TopicPhotoLinksDto (
    @SerializedName("self") val self             : String,
    @SerializedName("html") val html             : String,
    @SerializedName("download") val download         : String,
    @SerializedName("download_location") val downloadLocation : String
)
fun TopicPhotoLinksDto.toTopicPhotoLinks() : TopicPhotoLinks{
    return  TopicPhotoLinks(
        self =self,
        html=html,
        download=download,
        downloadLocation=downloadLocation
    )
}
