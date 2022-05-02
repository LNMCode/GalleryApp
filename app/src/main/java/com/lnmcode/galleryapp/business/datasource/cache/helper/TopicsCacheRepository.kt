package com.lnmcode.galleryapp.business.datasource.cache.helper

import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsEntities

interface TopicsCacheRepository {
    suspend fun getTopics(): List<TopicsEntities>

    suspend fun getTopicsFromId(
        id: String,
    ): TopicsEntities

    suspend fun insertAndReplace(
        topicsEntities: TopicsEntities
    ): Long

    suspend fun deleteTopics(
        topicsEntities: TopicsEntities
    ): Int
}