package com.lnmcode.galleryapp.business.datasource.network.helper

import com.lnmcode.galleryapp.business.datasource.network.search.response.Search

interface IApiResponsitory {
    suspend fun search(
        key :String,
        query :String
    ) : Search
}