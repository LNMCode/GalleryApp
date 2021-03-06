package com.lnmcode.galleryapp.business.datasource.network.helper.topics

import com.lnmcode.galleryapp.business.datasource.network.topics.respose.TopicsDto

interface TopicsIApiRepository {
    suspend fun topics(
        key :String
    ) : List<TopicsDto>
}