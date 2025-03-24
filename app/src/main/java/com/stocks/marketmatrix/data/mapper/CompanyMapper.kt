package com.stocks.marketmatrix.data.mapper

import com.stocks.marketmatrix.data.local.CompanyListingEntity
import com.stocks.marketmatrix.data.remote.dto.CompanyInfoDto
import com.stocks.marketmatrix.domain.model.CompanyInfo
import com.stocks.marketmatrix.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}