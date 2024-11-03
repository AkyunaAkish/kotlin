package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun testAppHasGreeting() {
        val app = App()
        assertEquals("Hello, Kotlin!!", app.getGreeting(), "App should have a greeting")
    }
}