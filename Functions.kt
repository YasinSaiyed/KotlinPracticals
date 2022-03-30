package com.example.myapplication

fun main(){
    var result = add(44,55);
    println(result)
    result = add(100,1000)
    println(result)
    evenOdd(10)
}
//Inline function
//fun add(num1: Int, num2: Int) = num1 + num2;
fun add(num1: Int, num2:Int): Int{
    var sum = num1 + num2;
    return sum
}
fun evenOdd(num: Int){
    if(num % 2 == 0){
        println("Number is even");
    }
    else{
        println("Number is odd");
    }
}