package com.lnmcode.galleryapp.business.datasource.usecase

import androidx.annotation.WorkerThread
import com.lnmcode.galleryapp.business.datasource.network.helper.topics.TopicsIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics
import com.lnmcode.galleryapp.business.domain.utils.DataState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import timber.log.Timber

class TopicsUseCase constructor(
    private val keyAPI: String,
    private val topicsIApiRepository: TopicsIApiRepository
) {

    init {
        Timber.d("Injection TopicsUserCase")
    }

    @WorkerThread
    fun getTopics(
        onSuccess: () -> Unit,
    ): Flow<List<Topics>> = flow {
        val topics = topicsIApiRepository.topics(key = keyAPI)

        emit( topics)

    }.onCompletion { onSuccess() }.flowOn(Dispatchers.IO).catch { e ->
        Timber.e(e.message)
    }

}