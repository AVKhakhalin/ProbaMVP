package com.example.probamvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.probamvp.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity(), GreetingView {
    private val presenter = Presenter() // Здесь ошибка в конструкторе
    // Binding
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        // Подключение Binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            presenter.attach(this)
            presenter.buttonClick()
        }

        // Отображение содержимого макета
        setContentView(binding.root)
    }

    override fun setGreeting(greeting: String){
        binding.button.text = greeting
    }
}