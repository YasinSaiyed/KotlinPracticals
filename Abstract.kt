package com.example.myapplication

fun main(){
   val circle = Circles(2.0)
   println(circle.area())
   
}

abstract class Shapes{
    var name: String =""
    abstract fun area(): Double
    open fun display() = println("Shape is displayed")
}

class Circles(val radius: Double): Shapes(){
    override fun area(): Double = Math.PI * radius * radius
}