package com.lnmcode.galleryapp.business.domain.cache

import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsEntities

data class TopicsCacheDomain(
    val id: String,
    val slug: String,
    val title: String,
    val description: String,
)

fun TopicsCacheDomain.toEntity(): TopicsEntities {
    return TopicsEntities(
        id, slug, title, description
    )
}