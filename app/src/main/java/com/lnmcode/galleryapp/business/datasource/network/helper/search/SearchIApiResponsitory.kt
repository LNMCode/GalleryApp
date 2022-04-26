package com.lnmcode.galleryapp.business.datasource.network.helper.search

import com.lnmcode.galleryapp.business.datasource.network.search.response.Search

interface SearchIApiRepository {
    suspend fun search(
        key :String,
        query :String
    ) : Search
}