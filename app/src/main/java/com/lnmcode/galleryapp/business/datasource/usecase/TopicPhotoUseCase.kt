package com.lnmcode.galleryapp.business.datasource.usecase
import android.util.Log
import androidx.annotation.WorkerThread
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto.TopicPhotoIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.topic.reponse.toTopicDomain
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhotoResponse
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.toTopicPhoto
import com.lnmcode.galleryapp.business.domain.models.topic.Topic
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import timber.log.Timber

class TopicPhotoUseCase(
    private val keyApi :String,
    private val topicPhotoApiRepository: TopicPhotoIApiRepository
) {
    init {
        Timber.d("Injection TopicsPhotoUserCase")

    }
    @WorkerThread
    fun getTopicPhoto(
        onSuccess: () -> Unit,
    ) : Flow<List<TopicPhoto>> = flow{
        val topicPhoto = topicPhotoApiRepository.topicPhoto(id= "BJJMtteDJA4", key =keyApi).map { it.toTopicPhoto()
        }
        emit(topicPhoto)
    }.onCompletion {
        onSuccess()

    }.flowOn(Dispatchers.IO).catch {e->
        Timber.e(e.message)

    }
}