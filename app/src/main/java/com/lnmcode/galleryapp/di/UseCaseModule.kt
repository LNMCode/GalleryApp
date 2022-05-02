package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.usecase.*
import com.lnmcode.galleryapp.business.domain.utils.Constants
import org.koin.core.qualifier.named
import org.koin.dsl.module

val useCaseModule = module {

    // UseCase network
    single { SearchUseCase(get()) }

    single { TopicPhotoUseCase(get(qualifier = named(Constants.KEY_API_URL_NAME)),get()) }

    factory { TopicsUseCase(get(qualifier = named(Constants.KEY_API_URL_NAME)), get()) }

    single { TopicUseCase(get(qualifier = named(Constants.KEY_API_URL_NAME)),get()) }

    // UseCase cache
    single { TopicsCacheUseCase(get()) }
}