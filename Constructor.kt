package com.example.myapplication

fun main(){

    var car1 = Automobile("Car","Petrol")
    println(car1.name);
    println(car1.tyres);
    println(car1.maxSeating);
    println(car1.engineType);


}

class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String){
    init{
        println("$name is created");
    }
    init{
        println("2nd initializer block")
    }
    constructor(nameParam: String, engineParam: String) :this(name=nameParam, tyres =4, maxSeating= 4, engineType= engineParam)
}