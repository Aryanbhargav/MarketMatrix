package com.stocks.marketmatrix.di

import com.stocks.marketmatrix.data.csv.CSVParser
import com.stocks.marketmatrix.data.csv.CompanyListingsParser
import com.stocks.marketmatrix.data.csv.IntradayInfoParser
import com.stocks.marketmatrix.data.repository.StockRepositoryImpl
import com.stocks.marketmatrix.domain.model.CompanyListing
import com.stocks.marketmatrix.domain.model.IntradayInfo
import com.stocks.marketmatrix.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}