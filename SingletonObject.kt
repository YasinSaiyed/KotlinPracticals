package com.example.myapplication

fun main(){
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()
}

object SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = fbLikes++
    fun display() = println("Facebook - $fbLikes -- Twitter - $twitterLikes")
}