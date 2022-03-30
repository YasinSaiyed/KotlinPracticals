package com.example.myapplication

fun main(){

    val Alto = Cars("Alto", "Petrol/CNG", 500)
    println(Alto.name);
    Alto.driveCar()
}

class Cars(val name:String, val type:String, var kmDriven: Int){

    fun driveCar(){
        println(" $name Car is ready to drive");
    }

    fun applyBrakes(){
        println(" $name Brakes are ok")
    }
}