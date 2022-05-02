package com.lnmcode.galleryapp.business.datasource.usecase

import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchApiRepository
import com.lnmcode.galleryapp.business.datasource.network.search.SearchResultsDto

class SearchUseCase(private val searchApiRepository: SearchApiRepository) {
    suspend fun getSearch(query :String, key: String) : List<SearchResultsDto>{
        val repository = searchApiRepository.search(query = query, key = key)
        return  repository.results
    }
}