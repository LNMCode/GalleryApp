package com.lnmcode.galleryapp.business.datasource.network.helper.topic

import com.lnmcode.galleryapp.business.datasource.network.topic.reponse.Topic
import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhoto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TopicApiService {
    @GET("topics/{id_or_slug}")
    suspend fun topicPhoto(
        @Path("id_or_slug") id :String,
        @Query("client_id") key :String
    ): Topic
}