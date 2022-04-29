package com.lnmcode.galleryapp.presentation.ui.boards

import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.lnmcode.galleryapp.bindables.BindingViewModel
import com.lnmcode.galleryapp.bindables.asBindingProperty
import com.lnmcode.galleryapp.bindables.bindingProperty
import com.lnmcode.galleryapp.business.datasource.usecase.TopicsCacheUseCase
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.business.datasource.usecase.TopicsUseCase
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import timber.log.Timber

class BoardsViewModel(
    private val topicsUseCase: TopicsUseCase,
    private val topicsCacheUseCase: TopicsCacheUseCase,
) : BindingViewModel() {

    @get:Bindable
    var isLoading: Boolean by bindingProperty(true)
        private set

    private val topicsFlow = topicsUseCase.getTopics(
        onSuccess = { isLoading = true }
    )

    @get:Bindable
    val topics: List<Topics> by topicsFlow.asBindingProperty(viewModelScope, emptyList())

    private val topicsCacheStateFlow = MutableStateFlow<Long>(-1)
    private val topicsCacheFlow = topicsCacheStateFlow.flatMapLatest {
        topicsCacheUseCase.getTopics(
            onSuccess = {
                isLoading = true
            }
        )
    }

    @get:Bindable
    val topicsCache: List<TopicsCacheDomain> by topicsCacheFlow.asBindingProperty(
        viewModelScope,
        emptyList()
    )

    private val topicsDomainStateFlow = MutableStateFlow<TopicsCacheDomain?>(null)
    private val topicsDomainFlow = topicsDomainStateFlow.flatMapLatest {
        topicsCacheUseCase.insertAndReplace(
            it,
            onSuccess = {
                onRefreshTopicsFromCache()
                isLoading = true
            }
        )
    }

    @get:Bindable
    val topicsDomainLong: Long? by topicsDomainFlow.asBindingProperty(viewModelScope, -1)

    fun insertTopicsCache(topicsCacheDomain: TopicsCacheDomain) {
        Timber.d(topicsCacheDomain.toString())
        topicsDomainStateFlow.value = topicsCacheDomain
    }

    private fun onRefreshTopicsFromCache() {
        Timber.d("onRefreshTopicsFromCache $topicsDomainLong")
        topicsCacheStateFlow.value = topicsDomainLong ?: 0
    }

    init {
        Timber.d("Init Boards View model")
    }

}