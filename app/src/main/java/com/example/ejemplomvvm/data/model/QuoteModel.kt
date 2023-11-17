package com.example.ejemplomvvm.data.model

import com.google.gson.annotations.SerializedName

//con serializedName, lo que hacemos es cambiar el nombre como viene de nuestro backend

data class QuoteModel (
    @SerializedName("author")  val author:String,
    @SerializedName("quote") val quote:String) {

}


