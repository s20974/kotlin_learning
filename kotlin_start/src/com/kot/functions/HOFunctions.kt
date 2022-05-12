package com.kot.functions

import java.util.*

fun main() {
    val result = modifyString("Hello") { it.uppercase(Locale.getDefault()) }
    println(result)
}

fun modifyString(string: String, modify: (String) -> String) : String{
    return modify(string)
}