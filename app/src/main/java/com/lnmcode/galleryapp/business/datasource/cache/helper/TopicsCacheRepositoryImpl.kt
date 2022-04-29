package com.lnmcode.galleryapp.business.datasource.cache.helper

import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsDao
import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsEntities

class TopicsCacheRepositoryImpl constructor(
    private val topicsDao: TopicsDao,
) : TopicsCacheRepository {
    override suspend fun getTopics(): List<TopicsEntities> {
        return topicsDao.getTopics()
    }

    override suspend fun getTopicsFromId(id: String): TopicsEntities {
        return topicsDao.getTopicsFromId(id)
    }

    override suspend fun insertAndReplace(topicsEntities: TopicsEntities): Long {
        return topicsDao.insertAndReplace(topicsEntities)
    }
}