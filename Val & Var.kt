package com.example.myapplication

fun main() {
    //variable declaration with datatype
    var score : Int = 12;
    var temperature : Double = 44.4;
    var isAvailable : Boolean = true;
    var alphabet : Char = 'Y';
    var name : String = "Yasin Saiyad";


    var value = 44;
    val message = "Hello Yasin"

    // var can be reassigned
    value = 55;

    /*val can not be reassigned and if try will show error
    use val to declare constant
    message = "Mann"*/

    println(value);
    println(message)
}