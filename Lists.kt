package com.example.myapplication

fun main(){
    val num = mutableListOf(1,2,3)
    println(num.indexOf(2))  //will print index of given element
    println(num.contains(0)) //check if element is in the list or not
    num[1] = 5
    num.add(4) // add number or data in the list
    num.remove(2) // remove particular element from the list
    println(num)

    val list1 = listOf(44,55)
    num.addAll(list1) // append list at the end of the given list
    println(num)
}