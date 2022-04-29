package com.lnmcode.galleryapp.presentation.ui.boards

import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.lnmcode.galleryapp.bindables.BindingViewModel
import com.lnmcode.galleryapp.bindables.asBindingProperty
import com.lnmcode.galleryapp.bindables.bindingProperty
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.business.datasource.usecase.TopicsUseCase
import timber.log.Timber

class BoardsViewModel (
    private val topicsUseCase: TopicsUseCase
) : BindingViewModel() {

    @get:Bindable
    var isLoading: Boolean by bindingProperty(true)
        private set

    private val topicsFlow = topicsUseCase.getTopics(
        onSuccess = { isLoading = true }
    )

    @get:Bindable
    val topics: List<Topics> by topicsFlow.asBindingProperty(viewModelScope, emptyList())

    init {
        Timber.d("Init Boards View model")
    }

}