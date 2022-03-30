package com.example.myapplication

// Maps key and value pair
// Mutable and immutable

fun main(){
    val students = mutableMapOf<Int, String>()
    students.put(1,"Saiyed")
    students.put(2,"Mohammad")
    students.put(3,"Yasin")
    students.put(4,"Ahmad")
    println(students)
    println(students.get(1)) //get element with particular key

  for((key,value) in students){
      println("$key = $value")
  }
    val student = mapOf<Int, String>(1 to "Yasin", 2 to "Saiyed")
}