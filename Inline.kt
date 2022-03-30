package com.example.myapplication

fun main(){
    calculateTimeAndRun { loop(100000) }
}

fun calculateTimeAndRun(fn: ()-> Unit){
    val start : Long = System.currentTimeMillis()
    fn()
    val end : Long = System.currentTimeMillis()
    println("Time taken ${end - start} ms")
}
fun loop(n:Long){
    for(i in 1..n){
        //
    }
}