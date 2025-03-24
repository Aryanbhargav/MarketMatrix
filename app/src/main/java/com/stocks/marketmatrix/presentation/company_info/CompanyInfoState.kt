package com.stocks.marketmatrix.presentation.company_info

import com.stocks.marketmatrix.domain.model.CompanyInfo
import com.stocks.marketmatrix.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
