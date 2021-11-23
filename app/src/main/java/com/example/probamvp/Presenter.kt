package com.example.probamvp

class Presenter() {
    var view: GreetingView? = null
    val model: Model = Model()

    fun attach(view: GreetingView) {
        this.view = view
    }
    fun buttonClick(){
        view?.let{
            val greeting = model.getGreeting()
            it.setGreeting(greeting)
        }
    }
}