package com.example.primeira.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){

    val texto = ObservableField<String>()

    init {
        texto.set("Teste")
    }

    fun Potugues(){
        texto.set("Ola!")
    }

    fun Ingles(){
        texto.set("Hello!")
    }
    fun Espanhol(){
        texto.set("Hola!")
    }
    fun Frances(){
        texto.set("bonjour!")
    }

}