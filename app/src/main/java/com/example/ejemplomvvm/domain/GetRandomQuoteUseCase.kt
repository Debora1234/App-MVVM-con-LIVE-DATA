package com.example.ejemplomvvm.domain

import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.model.QuoteProvider
import com.example.ejemplomvvm.data.QuoteRepository
import com.example.ejemplomvvm.data.model.QuoteProvider.Companion.quotes
import kotlin.text.Typography.quote

class GetRandomQuoteUseCase {
    operator fun invoke(): QuoteModel?{
        val quotes=QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber=(quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }

}