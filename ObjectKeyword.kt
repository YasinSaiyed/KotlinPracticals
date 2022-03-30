package com.example.myapplication

fun main(){
    println(AA.num)
    BB.test()
}

object  AA{
    val num: Int = 10
}

object BB{
    val p: Int = 20
    fun test(){
        println("This is object BB")
    }
}