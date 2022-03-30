package com.example.myapplication
//While loop
fun main(){
    var number = 2;
    var index = 1;
    while(index<=10){
       // println("2 * " + index +" = "+number*index);
        println("$number * $index = ${number * index}")// String Templating
        index++;
    }

    // For loop demonstration
    for(i in 1..5 step 2){ // step 2 for increment i by 2 else it is increment 1 by default
        println(i)
    }

    for(i in 10 downTo 1){ //downTo is used to decrement it by 1
        println(i)
    }
}