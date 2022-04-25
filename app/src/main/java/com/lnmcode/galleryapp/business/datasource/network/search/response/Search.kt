package com.lnmcode.galleryapp.business.datasource.network.search.response

import com.google.gson.annotations.SerializedName
import com.lnmcode.galleryapp.business.datasource.network.search.SearchResultsDto

data class Search(
    @SerializedName("total"       ) val total      : Int,
    @SerializedName("total_pages" ) val totalPages : Int?,
    @SerializedName("results"     ) val results    : ArrayList<SearchResultsDto>
)
