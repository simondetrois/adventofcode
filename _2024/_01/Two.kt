package _2024._01

import _2024.common.getLinesOfFile

fun main(){
    val input = getLinesOfFile("_2024/_01/input")
        .map { getBothNumbers(it) }

    val firstList = input.map { it.first }.sorted().toSet().toList()
    val secondList = input.map { it.second }.sorted()

    var similarityScore = 0

    firstList.forEach { first ->
        similarityScore += secondList.filter { second -> first == second  }.size * first
    }

    println(similarityScore)
}