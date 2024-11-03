package com.example

class App {
    fun getGreeting(): String {
        return "Hello, Kotlin!!"
    }
}

fun main() {
    println(App().getGreeting())
}