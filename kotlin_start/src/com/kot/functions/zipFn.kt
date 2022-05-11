package com.kot.functions

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for(i in 0..20){
        names.add("Name №$i")
        phones.add(380_000_000_000 + (Math.random() * 380_000_000_000).toLong())
    }

    val users = names.zip(phones)
    for(user in users){
        println("Name: ${user.first}; Phone: ${user.second}")
    }

    println()

    val fullName = mutableListOf<String>()
    for(i in 0..20){
        fullName.add("Name$i Surname$i")
    }

    val user = fullName.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for(i in user){
        println("Name: ${i.first}; Surname: ${i.second}")
    }
}