package com.lnmcode.galleryapp.business.datasource.network.helper.search


import com.lnmcode.galleryapp.business.datasource.network.search.response.Search
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search/photos")
    suspend fun  search(
        @Query("client_id") key :String,
        @Query("") query :String
    ) :Search

}