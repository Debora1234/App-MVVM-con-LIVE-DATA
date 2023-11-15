package com.example.ejemplomvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.ejemplomvvm.databinding.ActivityMainBinding
import com.example.ejemplomvvm.viewmodel.QuoteViewModel
import com.google.android.material.snackbar.BaseTransientBottomBar.AnimationMode

class MainActivity : AppCompatActivity() {

    /*puesta en marcha del proyecto */
    private  lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.tcQuote.text = currentQuote.quote
            binding.tvAutor.text = currentQuote.author
        })

        /*hacemos toda la pantalla un boton */
        binding.viewContainer.setOnClickListener{ quoteViewModel.randomQuote()
        }

    }
    /*fin de la puesta en marcha del proyecto */
}