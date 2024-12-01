package _2024._01

import _2024.common.getLinesOfFile
import java.io.File

fun main() {

    val input = getLinesOfFile("_2024/_01/input")
        .map { getBothNumbers(it) }


    val firstList = input.map { it.first }.sorted()
    val secondList = input.map { it.second }.sorted()

    var totalSum = 0

    firstList.forEachIndexed() { index, element ->
        totalSum += Math.abs(element - secondList[index])
    }

    println(totalSum)

}

