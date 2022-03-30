package com.example.myapplication

import kotlin.math.pow

fun main(){
   var fn = :: sum
    println(fn(2.0,3.0))
    calculator(10.0,20.0,::sum)
}

fun sum(a: Double, b: Double): Double{
    return a + b
}

//Higher order function take function as argument or return any function
fun calculator(a: Double, b: Double, gn:(Double,Double)-> Double){
    val result= gn(a,b)
    println(result)
}