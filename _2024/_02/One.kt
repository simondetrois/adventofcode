package _2024._02

import _2024.common.getLinesOfFile

fun main() {
    val levelLists = getLinesOfFile("_2024/_02/input")
        .map { it.split(" ") }
        .map { it.map { it.toInt() } }

    var saveLists = 0

    levelLists.forEach {
        if (checkIfSave(it)) {
            saveLists++
        }
    }

    print(saveLists)
}

private fun checkIfSave(list: List<Int>): Boolean {
    val direction = if (isIncreasing(list.toSet().toList())) 1 else -1
    for (i in 0..list.size - 2) {
        if (pairIsInvalid(list[i], list[i+1], direction)) return false
    }
    return true
}

