package com.kot.collections

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for(i in 0..50){
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { number: Int -> number % 2 == 0 }
    for(i in listOfEvenNumbers){
        print("$i ")
    }
    val listOfNames = mutableListOf("Alex", "Bob", "James", "Onton", "Alen")
    val listNameStrA = listOfNames.filter { it.startsWith("A") }
    println()
    for(i in listNameStrA){
        print("$i ")
    }

    println("\n ========== \n")

    val numbers = (0..10).toList()
    val doubleNum = numbers.map { number: Int -> number * 2 }
    for(i in doubleNum){
        print("$i ")
    }
    val emp = numbers.map{ "Employee №$it" }
    println()
    for(e in emp){
        print("$e ")
    }
    println("\n ========== \n")

    val array = arrayOf(3, 67, 1, -10, 234, 2)

    var sortedArray = array.sorted()

    for(i in sortedArray){
        print("$i ")
    }

    sortedArray = sortedArray.sortedDescending()

    for(i in sortedArray){
        print("$i ")
    }

    println("\n ========== \n")

    val initArray = mutableListOf<Int>()
    for(i in 0 until 1000){
        initArray.add((Math.random() * 1000).toInt())
    }
    println()
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map{"$it"}
    for(i in result){
        print("$i ")
    }

}