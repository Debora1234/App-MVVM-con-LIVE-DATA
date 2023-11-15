package com.example.ejemplomvvm.model

class QuoteProvider {
    companion object {

        fun random():QuoteModel{
            val position = (0..3).random()
            return quote[position]
        }


        val quote = listOf<QuoteModel>(
            QuoteModel(quote="Ejemplo1", author = "deby1"),
            QuoteModel(quote="Ejemplo2", author = "deby2"),
            QuoteModel(quote="Ejemplo3", author = "deby3"),
            QuoteModel(quote="Ejemplo4", author = "deby4"),

            )
    }
}