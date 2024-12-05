package _2024._03

import _2024.common.getLinesOfFile

fun main() {
    var result = 0

    val regex = Regex("(do\\(\\)|don't\\(\\)|mul\\(\\d{1,3},\\d{1,3}\\))")
    var inputString = getLinesOfFile("_2024/_03/input")[0]
    var enabled = true
    regex
        .findAll(inputString)
        .map { it.value.toString() }
        .toList()
       .filter {
           if (it == "do()") {
               enabled = true
               false
           } else if (it == "don't()") {
               enabled = false
               false
           } else {
               enabled
           }
       }
       .map { it.replace("mul(", "").replace(")", "").split(",").map { it.toInt()  }}
    .forEach { result += it[0] * it[1]  }

    println(result)
}

