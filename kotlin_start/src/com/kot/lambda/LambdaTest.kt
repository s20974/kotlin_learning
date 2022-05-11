package com.kot.lambda

fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b}
    println(sum(1,2))

    val square: (Int) -> Int = {it * it}
    println(square(3))

    val perimeter: (Int, Int) -> Int = {a, b -> a*b}
    println(perimeter(2, 2))

    val nameWithString = {name: String -> println(name)}
    nameWithString("name")

    val arraySort: (Array<Int>) -> Array<Int> = {
        for(i in 1 until it.size){
            for(j in it.size - 1 downTo i){
                if(it[j] < it[j-1]){
                    val min = it[j]
                    it[j] = it[j-1]
                    it[j-1] = min
                }
            }
        }
        it
    }

    val sortedArray = arraySort(arrayOf(34, 23, 3, 4, 5))
    for(i in sortedArray){
        print("$i ")
    }
}