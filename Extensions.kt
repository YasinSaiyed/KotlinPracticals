package com.example.myapplication

fun main(){
    println("Saiyed Yasin".formattedString())
}

fun String.formattedString(): String{
    return "--------------------\n$this\n--------------------"
}