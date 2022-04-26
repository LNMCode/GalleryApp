package com.lnmcode.galleryapp.business.datasource.network.helper.topics

import com.lnmcode.galleryapp.business.datasource.network.topics.respose.Topics
import retrofit2.http.GET
import retrofit2.http.Query

interface TopicsApiService {
 @GET("topics")
 suspend fun topics(
     @Query("client_id") key :String
 ):Topics
}