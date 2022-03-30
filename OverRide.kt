package com.example.myapplication

fun main(){
    val onePlus = OnePlus()
    onePlus.display()
}

open class Mobile(){
    val name: String = "";
    val size: Int = 5;
    fun makeCall(){
        println("Calling from mobile")
    }
    fun powerOff(){
        println("Shutting down")
    }
    open fun display(){
        println("Mobile Display")
    }
}

class OnePlus: Mobile(){
    override open fun display(){
        println("OnePlus display")
    }


}