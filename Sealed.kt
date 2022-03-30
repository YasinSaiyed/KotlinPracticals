package com.example.myapplication

fun main(){
    val tile: Tile = Red("Mushroom", 25)
    val tile2 = Red("Fire", 30)


    val points: Int =when(tile){
        is Red -> tile.points * 2
        is Blue -> tile.points * 5

    }
    println(points)
}

sealed class Tile
class Red(val types: String, val points: Int): Tile()
class Blue(val points: Int): Tile()