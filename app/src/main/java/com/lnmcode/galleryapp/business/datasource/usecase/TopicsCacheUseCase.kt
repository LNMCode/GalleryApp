package com.lnmcode.galleryapp.business.datasource.usecase

import androidx.annotation.WorkerThread
import com.lnmcode.galleryapp.business.datasource.cache.helper.TopicsCacheRepository
import com.lnmcode.galleryapp.business.datasource.cache.topics.toTopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.cache.toEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import timber.log.Timber

class TopicsCacheUseCase(
    private val topicsCacheRepository: TopicsCacheRepository,
) {

    init {
        Timber.d("Injection TopicsCacheUseCase")
    }

    @WorkerThread
    fun getTopics(
        onSuccess: () -> Unit,
    ): Flow<List<TopicsCacheDomain>> = flow {
        val topicsCache = topicsCacheRepository.getTopics().map { it.toTopicsCacheDomain() }
        emit(topicsCache)
    }.onCompletion { onSuccess() }.flowOn(Dispatchers.IO).catch { e ->
        Timber.e(e.message)
    }

    @WorkerThread
    fun getTopicsFromId(
        id: String,
        onSuccess: () -> Unit,
    ): Flow<TopicsCacheDomain> = flow {
        val topics = topicsCacheRepository.getTopicsFromId(id).toTopicsCacheDomain()
        emit(topics)
    }.onCompletion { onSuccess() }.flowOn(Dispatchers.IO).catch { e ->
        Timber.e(e.message)
    }

    @WorkerThread
    fun insertAndReplace(
        topicsCacheDomain: TopicsCacheDomain?,
        onSuccess: () -> Unit,
    ) = flow {
        val topicsEntities = topicsCacheDomain?.toEntity()
        val longInsert = topicsEntities?.let { topicsCacheRepository.insertAndReplace(it) }
        emit(longInsert)
    }.onCompletion { onSuccess() }.flowOn(Dispatchers.IO).catch { e ->
        Timber.e(e.message)
    }
}