package com.example.myapplication

fun main(){
    val obj = Outer()
    println(obj.i)

    val nested = Outer(). Nested()
    nested.test()
}

class Outer{
    var i = 0
    inner class Nested{
        fun test(){
            println("I am in nested class $i ")
        }
    }
}