package com.kot.exceptions

fun main() {
    println(sumStringTest("10", "20"))
}

fun sumStringTest(a : String, b : String) : Int {
    return try{
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    }   catch (e: java.lang.Exception){
        0
    }
}