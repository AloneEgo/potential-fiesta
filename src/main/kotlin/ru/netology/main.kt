package ru.netology

fun main(){

    val likes: Int = 11
    var human: String = if ((likes - 1) % 10 == 0 && (likes != 11 || likes == 0)) "человеку" else "людям"

    println("Понравилось $likes $human")
}