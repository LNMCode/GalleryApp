package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.business.datasource.interceptor.RequestInterceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    single { RequestInterceptor() }

    single { okHttpClientBuilder(get()) }

    single { retrofitBuilder(get()) }

    //single { get<Retrofit>().create() }

}

internal fun okHttpClientBuilder(
    interceptor: RequestInterceptor
): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()
}

internal fun retrofitBuilder(
    okHttpClient: OkHttpClient
): Retrofit {
    return Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}