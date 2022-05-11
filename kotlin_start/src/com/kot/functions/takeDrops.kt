package com.kot.functions

fun main() {
    val array = (0..50).toList()
    val employees = array.map{"Employee №$it"}
    val first20 = employees.take(20)
    for(employee in first20){
        print("$employee ")
    }
    println()
    val lastDrops = employees.drop(30)
    for(employee in lastDrops){
        print("$employee ")
    }
    println()

    // lazy
    val ar = generateSequence(0) {
        println(it + 2)
        it + 2
    }
    println()
    for(i in ar.take(10)){
        print("$i ")
    }

    val arrEmp = generateSequence("Emp №1"){
        val index = it.substring(5).toInt()
        "Emp №${index+1}"
    }
    println()
    val listFirst20 = arrEmp.take(20)
    for(empl in listFirst20) {
        println(empl)
    }
}