package com.example.myapplication
// Range Example
fun main(){
    var number = 5;
    var result = number in 1..5; //1,2,3,4,5
    println(result);
    result = number in 1 until 5; //1,2,3,4
    println(result);
}