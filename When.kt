package com.example.myapplication

// Example of when
// Alternative of else..if to increase readability

fun main(){
    var animal = "Horse";
//    if(animal == "Buffalo"){
//        println("Animal is Buffalo")
//    }
//    else if(animal == "Horse"){
//        println("Animal is Horse");
//    }
//    else if(animal == "Cat"){
//        println("Animal is Cat");
//    }
//    else{
//        println("No animal found");
//    }

    when(animal){
        "Buffalo" -> println("Animal is Buffalo");
        "Horse" -> println("Animal is Horse");
        "Cat" -> println("Animal is Cat");
        "Buffalo" -> println("Animal is Buffalo");
        else -> println("Animal not found")
    }
    var marks = 90;
    var result = when(marks){
        in 81..100 -> "Distincton";
        in 71..80 -> "First Class";
        in 61..70 -> "Second Class";
        in 40..60 -> "Third Class";
        else -> "Fail";
    }
    println(result);
}