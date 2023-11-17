package com.example.ejemplomvvm.data.model.network

import com.example.ejemplomvvm.core.RetrofitHelper
import com.example.ejemplomvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/*le decimos si lo saca de una base de datos o de intenet*/
class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}