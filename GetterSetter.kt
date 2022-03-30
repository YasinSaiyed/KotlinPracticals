package com.example.myapplication

fun main(){
    val p1 = Person("saiyed yasin",21)
    println(p1.age)
    p1.age = 23
    p1.age = -44
    println(p1.name)
}
class Person(nameParam: String, ageParam: Int){
    var name: String = nameParam
    get(){
        return field.toUpperCase()
    }
    var age: Int = ageParam
    set(value) {
        if(value > 0){
            field = value
        }
        else{
            println("Age cannot be negative")
        }
    }
}