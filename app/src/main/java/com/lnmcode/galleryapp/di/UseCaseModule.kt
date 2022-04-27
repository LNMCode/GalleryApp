package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.usecase.SearchUseCase
import com.lnmcode.galleryapp.business.datasource.usecase.TopicPhotoUseCase
import com.lnmcode.galleryapp.business.datasource.usecase.TopicUseCase
import com.lnmcode.galleryapp.business.datasource.usecase.TopicsUseCase
import org.koin.dsl.module

val useCaseModule = module {

    single { SearchUseCase(get()) }

    single { TopicPhotoUseCase(get()) }

    single { TopicsUseCase(get()) }

    single { TopicUseCase(get()) }
}