package com.lnmcode.galleryapp.business.datasource.network.helper

import com.lnmcode.galleryapp.business.datasource.network.search.response.Search

class ApiResponsitoryImpl(val apiService: ApiService) :IApiResponsitory {
    override suspend fun search(key: String, query: String) = apiService.search(key = key, query = query)
}