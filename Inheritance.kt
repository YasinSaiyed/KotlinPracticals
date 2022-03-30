package com.example.myapplication

fun main(){
    val objChild = Child()
    objChild.myMethod1()
    objChild.myMethod()
}

open class Parent(){
    val name: String = ""

    fun myMethod(){
        println("I am in Parent")
    }
}
class Child : Parent(){
    val name1: String = ""

    fun myMethod1(){
        println("I am in Child")
    }
}