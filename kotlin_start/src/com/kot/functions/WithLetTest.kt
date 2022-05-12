package com.kot.functions

var name: String? = null

fun main() {
//    if(name?.length?.compareTo(5) == 1){
//        println("ddd")
//    }
    name?.let {
        if(it.length > 5){
            println("dddsss")
        }
    }

    var list = mutableListOf<Int>()
    for(i in 0..100){
        list.add((Math.random() * 100).toInt())
    }
    println(list.sum())
    println(list.average())
    println(list.first())
    println(list.last())
    println(list.maxOrNull())
    println(list.minOrNull())

    println()

    var list2 = mutableListOf<Int>()
    with(list2){
        for(i in 0..100){
            add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(first())
        println(last())
        println(maxOrNull())
        println(minOrNull())
    }
}