package com.example.myapplication
// Modifiers    Top level declarations  Class Members
// public -     access everywhere         Everywhere
// internal -   within module             Within a module
// private -    within file               Within a class
// protected -  N/A (members of class)    Subclasses

fun main(){
    val b = B()
    b.test()
}

open class A{
    public var p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40
}

class B : A(){
    fun test(){
        println(p)
       // println(q) // show error because private and cannot be accessed outside the class
        println(r)
        println(s)
    }
}