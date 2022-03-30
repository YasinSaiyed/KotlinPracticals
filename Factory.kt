package com.example.myapplicationpackage

fun main(){
    var pizza1: Pizza = Pizza.Factory.create("Peppy Paneer")
    println(pizza1)

    //Here I am calling via Factory reference - don't want to use Factory ref
    //Now after defining that as companion
    // var pizza2: Pizza = Pizza.create("Tomato")
    // println(pizza2)
}

//Example of Factory Pattern Using Companion

class Pizza(val type:String, val toppings: String){
    companion object Factory{ // this is factory object
        fun create(pizzaType: String) : Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato","Tomato, Cheeze")
                "Peppy Paneer" -> Pizza("Paneer Farm","Paneer, Cheese Burst, Tomato, Onion")
                else -> Pizza("Basic", "Onion, Cheese")
            }
        }
    }
}
