package com.example.myapplication

fun main(){
    var arr = arrayOf("Saiyed","Arshad","Yasin")
    var arr1 = arrayOf(1,2,3);
    var arr2 = arrayOf<Int>(10,20,30) // Explicit declaration

    for((i,e) in arr.withIndex()){
        println("$i  - $e")
    }

    println(arr1[0])// access by inedx
    println(arr2.get(0))
    arr2.set(0, 44);
    println(arr2[0])
}