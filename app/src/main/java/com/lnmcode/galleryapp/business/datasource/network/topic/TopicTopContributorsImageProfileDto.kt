package com.lnmcode.galleryapp.business.datasource.network.topic

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.domain.models.topic.TopicTopContributorsImageProfile

data class TopicTopContributorsImageProfileDto(

    @SerializedName("small"  ) val small  : String?,
    @SerializedName("medium" ) val medium : String?,
    @SerializedName("large"  ) val large  : String?
)
fun  TopicTopContributorsImageProfileDto.toTopicTopContributorsImageProfile() : TopicTopContributorsImageProfile{
    return TopicTopContributorsImageProfile(
        small=small, medium=medium, large=large
    )
}
