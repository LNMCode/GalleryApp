package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.cache.helper.TopicsCacheRepository
import com.lnmcode.galleryapp.business.datasource.cache.helper.TopicsCacheRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchApiRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto.TopicPhotoApiRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto.TopicPhotoIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.helper.topics.TopicsApiRepositoryImpl
import com.lnmcode.galleryapp.business.datasource.network.helper.topics.TopicsIApiRepository
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModel = module {

    // Repository network
    // Search repository
    single<SearchApiRepository> { SearchApiRepositoryImpl(get()) }

    // Topic repository
    single<TopicApiRepository> { TopicApiRepositoryImpl(get()) }

    single<TopicPhotoIApiRepository> { TopicPhotoApiRepositoryImpl(get()) }

    single<TopicsIApiRepository> { TopicsApiRepositoryImpl(get()) }

    // Repository cache
    single<TopicsCacheRepository> { TopicsCacheRepositoryImpl(get()) }
}