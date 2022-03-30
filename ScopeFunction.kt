package com.example.myapplication

fun main(){
    val emp = Employee()
    emp.age = 20
    emp.name = "Arshad"

    emp.apply {
        age = 22
        name = "Saiyed"
    }
    emp.let{
        println(it.name)
        println(it.age)
    }
    with(emp){
        name="Arshad"
        age = 30
    }
}

data class Employee(var name: String ="", var age: Int = 18)