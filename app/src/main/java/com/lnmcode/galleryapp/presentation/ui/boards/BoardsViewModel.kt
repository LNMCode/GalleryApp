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
    private val topicsCacheStateFlow = MutableStateFlow(0)
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

    private val insertTopicsDomainStateFlow = MutableStateFlow<TopicsCacheDomain?>(null)
    private val insertTopicsDomainFlow = insertTopicsDomainStateFlow.flatMapLatest {
        topicsCacheUseCase.insertAndReplace(
            it,
            onSuccess = {
                onDoneInsertTopicsCacheItem()
                onRefreshTopicsFromCache()
                isLoading = true
            }
        )
    }

    @get:Bindable
    private val insertTopicsDomain by insertTopicsDomainFlow.asBindingProperty(viewModelScope)

    private val deleteTopicsDomainStateFlow = MutableStateFlow<TopicsCacheDomain?>(null)
    private val deleteTopicsDomainFlow = deleteTopicsDomainStateFlow.flatMapLatest {
        topicsCacheUseCase.deleteTopics(
            it,
            onSuccess = {
                onDoneDeleteTopicsCacheItem()
                onRefreshTopicsFromCache()
                isLoading = true
            }
        )
    }

    @get:Bindable
    private val deleteTopicsDomain by deleteTopicsDomainFlow.asBindingProperty(viewModelScope)

    private var numberCountEvent: Int = -1

    fun insertTopicsCache(topicsCacheDomain: TopicsCacheDomain) {
        if (!topicsCache.contains(topicsCacheDomain)) {
            Timber.d(topicsCacheDomain.toString())
            insertTopicsDomainStateFlow.value = topicsCacheDomain
        }
    }

    fun deleteTopicsCache(topicsCacheDomain: TopicsCacheDomain) {
        Timber.d(topicsCacheDomain.toString())
        deleteTopicsDomainStateFlow.value = topicsCacheDomain
    }

    private fun onRefreshTopicsFromCache() {
        topicsCacheStateFlow.value = numberCountEvent++
        Timber.d("onRefreshTopicsFromCache ${topicsCacheStateFlow.value}")
    }

    private fun onDoneDeleteTopicsCacheItem() {
        deleteTopicsDomainStateFlow.value = null
    }

    private fun onDoneInsertTopicsCacheItem() {
        insertTopicsDomainStateFlow.value = null
    }

    init {
        Timber.d("Init Boards View model")

    }

}