package com.example.ejemplomvvm.data.model.network

import com.example.ejemplomvvm.data.model.QuoteModel
import retrofit2.http.GET
import retrofit2.Response


interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}