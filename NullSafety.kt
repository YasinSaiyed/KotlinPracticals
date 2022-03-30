package com.example.myapplication

fun main(){
    var gender: String = "Male" //"Female", "Others"
    var gender2: String? = null

    if(gender2 != null){
        println(gender2.toUpperCase());
    }
    println(gender2?.toUpperCase());

    //let is used to execute multiple statement
    gender2?.let{
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }
    var selectedValue = gender2?: "NA"
    println(selectedValue)
    //var value:String = gender2!!.toUpperCase()

}