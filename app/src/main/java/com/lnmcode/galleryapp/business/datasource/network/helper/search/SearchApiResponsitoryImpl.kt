package com.lnmcode.galleryapp.business.datasource.network.helper.search

class ApiRepositoryImpl(private val apiService: ApiService) : IApiRepository {
    override suspend fun search(key: String, query: String) = apiService.search(key = key, query = query)
}