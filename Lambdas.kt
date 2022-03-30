package com.example.myapplication

fun main(){
    var fn = :: summation
    val lambda1 = {x: Int, y: Int -> x + y}
    val multiLineLambda = {
        println("Multiline Lambda")
        val a = 2+3
        "Hello Coder"
        2
    }
    println(multiLineLambda())

    val singleParamLambda:(Int) ->Int = { x: Int -> x * x}
    val lambda2: (Int) -> Int = { x-> x * x}
}

fun summation( a: Int, b: Int): Int = a + b

fun calculator(a:Int, b: Int, op: (Int,Int) -> Int): Int{
    return op(a, b)
}