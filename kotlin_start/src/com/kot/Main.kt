package com.kot

//private var name: String = null
private var testNullable: String? = null

private var homeWorkNullable1: String? = "str1"
private var homeWorkNullable2: String? = "str2"
private var homeWorkNullable3: String? = "str2"
private var result: Int = 0

fun main(args: Array<String>){
    var name: String = "Name";
    val surname: String = "Surname"
    val age: Int = 19
    println("Hello $name $surname ! $age")
    name = "Alex"
    println(name)

    result = (homeWorkNullable1?.length?:0) + (homeWorkNullable2?.length?:0) + (homeWorkNullable3?.length?:0)
    println("Result: $result")

    println(testNullable?.length)
//    println(testNullable!!.length)

    val length: String? = testNullable?.length?.toString()
    println(length)
    val test: Int = testNullable?.length?:11
    println(test)

    println()
    println("==============================")
    println()

    val a = 50

    if(a < 40){
        println("< 40")
    }   else if(a < 60){
        println("> 40 and < 60")
    }   else {
        println("> 60")
    }

    var count = 600
    val food: String = if(count > 500){
        count -= 500
        "pizza"
    } else if(count > 300){
        count -= 300
        "500"
    } else {
        count -= 30
        "null"
    }

    println("You can buy: $food ${food.length}")

    println()
    println("==============================")
    println()

    val season: String = when("March"){
        "Dec", "Jan", "Feb" -> {
            "Winter"
        }
        "March" -> {
            "Spring"
        }
        else -> {
            "undefined"
        }
    }

    val indexOfSeason: Int = when(3){
        12,1,2 -> {
            1
        }
        in 3..5 -> {
            2
        }
        in 6..8 -> {
            3
        }
        in 9..11 -> {
            4
        }
        else -> {
            0
        }
    }

    println(season)
    println(indexOfSeason)


    val temp = 80
    val state = when {
        temp < 0 -> 1
        temp in 0..100 -> 2
        else -> 0
    }
    println(state)

    val time = 12
    val weather = true

    val toDo = when{
        time in 12..19 && weather -> "walk"
        time in 12..19 && !weather -> "read the book"
        else -> "sleep"
    }

    println(toDo)

}