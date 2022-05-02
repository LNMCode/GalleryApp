package com.lnmcode.galleryapp.presentation.ui.boards

import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain

interface BoardsActionCacheEvent {
    fun insertTopicsCache(topicsCacheDomain: TopicsCacheDomain)

    fun deleteTopicsCache(topicsCacheDomain: TopicsCacheDomain)
}