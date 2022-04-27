package com.lnmcode.galleryapp.business.datasource.network.helper.search

import com.lnmcode.galleryapp.business.datasource.network.search.response.Search

interface SearchApiRepository {
    suspend fun search(
        key :String,
        query :String
    ) : Search
}