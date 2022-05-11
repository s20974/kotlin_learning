package com.kot

fun main(){
    val array: Array<Int?> = arrayOf(1,2,3,4,5,6)
    array[4] = 10
    array[1] = null
    println(array[2])
    val nullsArray: Array<Int?> = arrayOfNulls(5)
    nullsArray[1] = 1

//    val listOfNumbers: List<Int> = ArrayList()
//    listOfNumbers.add(5)
//    println(listOfNumbers[0])

    val listOfNumbers: MutableList<Int> = ArrayList();
    listOfNumbers.add(5)
    println(listOfNumbers[0])

    val mutList: MutableList<Int> = mutableListOf()
    mutList.add(0)
    println(mutList[0])

    println()
    println("==============")
    println()

    val arrayForFor = arrayOf(1,2,3,4,5)
    for(i in arrayForFor){
        println(i)
    }

    val fromOneToHundred = arrayOfNulls<Int?>(101)

//    for(i in 0 until fromOneToHundred.size){
//        fromOneToHundred[i] = i
//        println(fromOneToHundred[i])
//    }

    for(i in fromOneToHundred.indices step 2){
        fromOneToHundred[i] = i
        println(fromOneToHundred[i])
    }

    println("==============")

    for(i in 100 downTo 0 step 3){
        println(i)
    }
    val arrayForFor2 = arrayOf(1,2,3,4,null)
    for((index, i) in arrayForFor2.withIndex()){
        arrayForFor2[index] = i?.times(2)
    }

    val testArray = arrayOfNulls<Int?>(301)
    for((index, i) in (300..600).withIndex()){
        testArray[index] = i
    }
    for(i in testArray.size - 1 downTo 0 step 5){
        println(testArray[i])
    }
}