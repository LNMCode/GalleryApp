package com.lnmcode.galleryapp.business.datasource.network.helper.search

class SearchApiRepositoryImpl(private val apiService: SearchApiService) : SearchApiRepository {
    override suspend fun search(key: String, query: String) = apiService.search(key = key, query = query)
}