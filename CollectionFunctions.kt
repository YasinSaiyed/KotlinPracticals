package com.example.myapplication

fun main(){
    val nums = listOf(1,2,3,4,5)
    println(isOdd(3))
    println(isOdd(2))

    val list = nums.filter(::isOdd)
    println(list)

    val list1 = nums.filter{it % 2 != 0} // perform same as above but will increase readability
    println(list1)

}

fun isOdd(a : Int): Boolean{
    return a % 2 != 0
}