package com.lnmcode.galleryapp.business.datasource.usecase
import androidx.annotation.WorkerThread
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepository
import com.lnmcode.galleryapp.business.datasource.network.topic.reponse.toTopicDomain
import com.lnmcode.galleryapp.business.domain.models.topic.Topic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import timber.log.Timber


class TopicUseCase(
    private val keyApi :String,
    private val topicApiRepository: TopicApiRepository) {
    init {
        Timber.d("Injection TopicsUserCase")

    }
    @WorkerThread
    fun getTopic(
        id: String,
        onSuccess: () -> Unit,
    ) : Flow<Topic> = flow{
        val topic = topicApiRepository.topic(id=id, key =keyApi).toTopicDomain()
        emit(topic)
    }.onCompletion {  }.flowOn(Dispatchers.IO).catch {

    }
}