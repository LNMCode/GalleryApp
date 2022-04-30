package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.usecase.SearchUseCase
import com.lnmcode.galleryapp.business.datasource.usecase.TopicPhotoUseCase
import com.lnmcode.galleryapp.business.datasource.usecase.TopicUseCase
import com.lnmcode.galleryapp.business.datasource.usecase.TopicsUseCase
import com.lnmcode.galleryapp.business.domain.utils.Constants
import org.koin.core.qualifier.named
import org.koin.dsl.module

val useCaseModule = module {

    single { SearchUseCase(get()) }

    single { TopicPhotoUseCase(get()) }

    factory { TopicsUseCase(get(qualifier = named(Constants.KEY_API_URL_NAME)), get()) }

    single { TopicUseCase(get(),get()) }
}