package com.example.myapplication

fun main(){
    val circle = Circle3(4.0)
    val player = Player3("XYZ")

    val arr:Array<Draggable3> = arrayOf(circle, player)
    for(obj: Draggable3 in arr){
        if(obj is Circle3){
            println(obj.area())
        }
        else{
            (obj as Player3).sayMyName()
        }
    }
}

interface Draggable3{
    fun drag()
}
abstract class Shape3: Draggable3{
    abstract fun area(): Double
}
class Circle3(val radius: Double): Shape3(){
    override fun area(): Double{
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging")
    }
}

class Player3(val name: String): Draggable3{
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hello my name is $name")
}