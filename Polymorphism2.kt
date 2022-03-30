package com.example.myapplication

fun main(){
    val shape = Shape1()
   printArea(shape)
    val square = Square1(3.0)
    printArea(square)


}
fun printArea(shape: Shape1){

        println(shape.area())

}
open class Shape1(){
    open fun area(): Double{
        return 0.0
    }
}
class Circle1(val radius: Double): Shape1(){
    override fun area(): Double{
        return Math.PI * radius * radius
    }
}
class Square1(val side: Double): Shape1(){
    override fun area(): Double{
        return side * side
    }
}
class Triangle1(val base: Double, val height: Double): Shape1(){
    override fun area(): Double{
        return 0.5 * base * height
    }
}