package com.lnmcode.galleryapp.business.datasource.usecase

import com.lnmcode.galleryapp.business.datasource.network.helper.search.SearchIApiRepository
import com.lnmcode.galleryapp.business.datasource.network.search.SearchResultsDto
import java.nio.channels.spi.AbstractSelectionKey

class SearchUseCase(private val searchIApiRepository: SearchIApiRepository) {
    suspend fun getSearch(query :String, key: String) : List<SearchResultsDto>{
        val repository = searchIApiRepository.search(query = query, key = key)
        return  repository.results
    }
}