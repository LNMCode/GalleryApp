package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchApiRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto.TopicPhotoIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topics.TopicsApiRepositoryImpl
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModel = module {

    // Search repository
    single { SearchApiRepositoryImpl(get()) } bind SearchApiRepository::class

    // Topic repository
    single { TopicApiRepositoryImpl(get()) } bind TopicApiRepository::class

    single { TopicApiRepositoryImpl(get()) } bind TopicPhotoIApiRepository::class

    single { TopicsApiRepositoryImpl(get()) } bind TopicsApiRepositoryImpl::class
}