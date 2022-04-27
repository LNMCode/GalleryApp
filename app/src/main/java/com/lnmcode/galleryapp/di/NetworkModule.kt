package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.interceptor.RequestInterceptor
import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchApiService
import com.lnmcode.galleryapp.business.datasource.network.helper.topic.TopicApiService
import com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto.TopicPhotoApiService
import com.lnmcode.galleryapp.business.datasource.network.helper.topics.TopicsApiService
import com.lnmcode.galleryapp.business.domain.utils.Constants
import okhttp3.OkHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    single(named(Constants.BASE_URL_API_NAME)) { baseUrlString() }

    single { RequestInterceptor() }

    single { okHttpClientBuilder(get()) }

    single { retrofitBuilder(get(), get(qualifier = named(Constants.BASE_URL_API_NAME))) }

    // Search service
    single { get<Retrofit>().create(SearchApiService::class.java) }

    // Topic service
    single { get<Retrofit>().create(TopicApiService::class.java) }

    single { get<Retrofit>().create(TopicPhotoApiService::class.java) }

    single { get<Retrofit>().create(TopicsApiService::class.java) }

}

internal fun okHttpClientBuilder(
    interceptor: RequestInterceptor
): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()
}

internal fun retrofitBuilder(
    okHttpClient: OkHttpClient,
    baseUrlAPI: String,
): Retrofit {
    return Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(baseUrlAPI)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

internal fun baseUrlString(): String {
    return "https://api.unsplash.com/"
}