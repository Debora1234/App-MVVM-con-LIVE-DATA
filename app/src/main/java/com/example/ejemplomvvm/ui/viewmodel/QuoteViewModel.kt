package com.example.ejemplomvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.model.QuoteProvider
import com.example.ejemplomvvm.domain.GetQuotesUseCase
import com.example.ejemplomvvm.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch
import kotlin.text.Typography.quote

class QuoteViewModel:ViewModel() {
    val quoteModel=MutableLiveData<QuoteModel>()

    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getQuotesUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
            }
        }

    }
    fun randomQuote(){
        val quote= getRandomQuoteUseCase()
        if(quote!=null){
            quoteModel.postValue(quote)
        }


    }


}