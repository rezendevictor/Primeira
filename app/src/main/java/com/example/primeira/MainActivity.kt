package com.example.primeira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.primeira.databinding.ActivityMainBinding
import com.example.primeira.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var mainViewModel: MainActivityViewModel


    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider
            .AndroidViewModelFactory
            .getInstance(application)
            .create(MainActivityViewModel::class.java)


        binding.mudaTexto = mainViewModel




    }
}
