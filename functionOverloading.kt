package com.example.myapplication

fun main(){
    var add= addition(1,2);
    println(add);
    addition(44.0,55.3);
    println(addition(44.0,55.3));


}

fun addition(num1: Int, num2:Int): Int{
    var sum = num1 + num2;
    return sum
}
fun addition(num1: Double, num2:Double): Double{
    var sum = num1 + num2;
    return sum
}