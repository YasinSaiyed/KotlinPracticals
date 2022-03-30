package com.example.myapplication

fun main(){
    val p1 = Person1(1,"John")
    val p2 = Person1(1,"John")

    val p3 = p1.copy()
    val p4 = p2.copy()
    println(p3)
    println(p4)
}

data class Person1(val id: Int, val name: String){

}