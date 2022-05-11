package com.kot

fun main(){
    println(max(5, 10))
    println(substr("aaa"))
    println(sum(1,2,3,4,5,6))

    val numbers = mutableListOf(5, 20, 2, 3, 15, 4, -10)
    val result = sort(5, 20, 2, 3, 15, 4, -10)
    for(i in result){
        print("$i ")
    }

    println("\n =============== \n")

    printInfo("name", "surname")
    println()
    printInfo(patronymic = "patronymic")
    println(boxVolume(3))
}

fun max(a: Int, b: Int) = if(a > b) a else b

fun substr(concatStr: String) = concatStr.substring(0, 5.coerceAtMost(concatStr.length))

fun sum(vararg numbers: Int) : Int{
    var result = 0;
    for(num in numbers){
        result += num
    }
    return result
}

fun sort(numbers: MutableList<Int>) : List<Int>{
    for(i in 1 until numbers.size){
        for(j in numbers.size - 1 downTo i){
            if(numbers[j] < numbers[j-1]){
                val min = numbers[j]
                numbers[j] = numbers[j-1]
                numbers[j-1] = min
            }
        }
    }

    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())


fun printInfo(name: String = "", surname: String = "", patronymic: String = ""){
    print("Name: $name; Surname: $surname;")
    if(patronymic.isNotEmpty()){
        println(" Patronymic: $patronymic")
    }
}
fun printInfo(name: String, surname: String){
    printInfo(name, surname, "")
}

fun boxVolume(a: Int, b: Int = a, c: Int = a) : Int = a* b *c