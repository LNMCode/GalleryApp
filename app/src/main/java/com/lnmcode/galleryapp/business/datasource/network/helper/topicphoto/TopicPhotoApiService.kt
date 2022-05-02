package com.lnmcode.galleryapp.business.datasource.network.helper.topicphoto

import com.lnmcode.galleryapp.business.datasource.network.topicphoto.reponse.TopicPhotoResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TopicPhotoApiService {
    @GET("topics/{id_or_slug}/photos")
    suspend fun topicPhoto(
        @Path("id_or_slug") id :String,
        @Query("client_id") key :String,
    ): List<TopicPhotoResponse>
}