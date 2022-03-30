package com.example.myapplication

fun main(){
    MyClass.MyObject.f()
    MyClass.f() // able to do this because of companion object
    MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject{ // only one companion object allowed
        @JvmStatic
        fun f(){
            println("Hello I am F from Object")
        }
    }

    object AnotherObject{
        fun g(){
            println("Hello I am G from another Object")
        }
    }
}