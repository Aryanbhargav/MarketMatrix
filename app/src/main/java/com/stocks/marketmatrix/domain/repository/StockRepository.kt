package com.stocks.marketmatrix.domain.repository

import com.stocks.marketmatrix.domain.model.CompanyInfo
import com.stocks.marketmatrix.domain.model.CompanyListing
import com.stocks.marketmatrix.domain.model.IntradayInfo
import com.stocks.marketmatrix.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}