package com.lnmcode.galleryapp.business.datasource.network.helper.topics

import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics

interface TopicsIApiRepository {
    suspend fun topics(
        key :String
    ) : List<Topics>
}