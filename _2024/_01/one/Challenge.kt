package _2024._01.one

import java.io.File

fun main() {

    val input = File("_2024/_01/one/inputnput")
        .useLines { it.toList() }
        .map {
            it.substring(0, 5).toInt() to it.substring(8, 13).toInt()
        }

    val firstList = input.map { it.first }.sorted()
    val secondList = input.map { it.second }.sorted()

    var totalSum = 0

    firstList.forEachIndexed() { index, element ->
        totalSum += Math.abs(element - secondList[index])
    }

    println(totalSum)

}

