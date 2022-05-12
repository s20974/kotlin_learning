package com.kot.collections

fun main() {
    val revenueByWeek = listOf(
        listOf(8, 10, 23, 1, 4),
        listOf(1, 4, 2, 10, 7),
        listOf(2, 1, 3, 15, 42),
        listOf(26, 2, 3, 11, 2),
        listOf(18, 20, 23, 11, 14)
    )

//    val total = mutableListOf<Int>()
//    revenueByWeek.map{
//        for(i in it){
//            total.add(i)
//        }
//    }
//    val average = total.average();
//    println(average)

    val total = revenueByWeek.flatten()
    val average = total.average();
    println(average)

    val data = mapOf<String, List<Int>>(
        "file1" to listOf(15, 20, 45, 12, 1),
        "file2" to listOf(14, 2, 5, 1, 11),
        "file3" to listOf(10, 12, 9, 7, 8)
    )
    val data2 = mapOf<String, List<Int>>(
        Pair("file1", listOf(15, 20, 45, 12, 1)),
        Pair("file2", listOf(14, 2, 5, 1, -11)),
        Pair("file3", listOf(10, 12, 9, 7, 8))
    )

    val average2 = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average2)
}