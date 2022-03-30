package com.example.myapplication

fun main(){
    val obj = IntContainer(44)
    println(obj.getValue())
    val iContainer = Container<Int>(55)
    println(iContainer.getValue())
    val sContainer = Container<String>("Yasin")

    add(1,2,3,4,5)
}

fun add(vararg values: Int){
    var sum = 0
    for(i in values){
        sum += i
    }
    println(sum)
}

class Container<T>(var data: T){
    fun setValue(value: T){
        data = value;
    }

    fun getValue(): T{
        return data
    }
}

class IntContainer(var data: Int){
    fun setValue(value: Int){
        data = value;
    }

    fun getValue(): Int{
        return data
    }
}

class StringContainer(var data: String){
    fun setValue(value: String){
        data = value;
    }

    fun getValue(): String{
        return data
    }
}