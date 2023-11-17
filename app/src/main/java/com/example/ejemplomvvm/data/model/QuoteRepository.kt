package com.example.ejemplomvvm.data

import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.model.QuoteProvider
import com.example.ejemplomvvm.data.model.network.QuoteService

class QuoteRepository {

    // Instancia de QuoteService
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        // Llamada a la función de QuoteService para obtener citas
        val response = api.getQuotes()

        // Almacenar las citas en el proveedor local
        QuoteProvider.quotes = response

        // Devolver la lista de citas
        return response
    }
}