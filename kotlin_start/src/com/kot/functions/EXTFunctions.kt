package com.kot.functions

fun main() {
    val age = 5
    if(age.isAgeValid()){
        println("ok")
    }

    val list = listOf<Int>()
//    myWith(list){
//        sum()
//        average()
//    }

    val obj = mutableMapOf<String, String>()
    myWith(obj){
        keys
        values
    }

}

fun Int.isAgeValid() = this in 6..100
fun Int.isPositive() = isAgeValid()

//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit){
//    list.operation()
//}
//
//fun myWith(obj: Any, operation: Any.() -> Unit){
//    obj.operation()
//}

inline fun<T, R> myWith(obj: T, operation: T.() -> R) : R{
    return obj.operation()
}