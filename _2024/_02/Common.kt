package _2024._02

fun pairIsInvalid(first: Int, second: Int, direction: Int): Boolean {
    val distance = second - first
    return (distance == 0 || Math.abs(distance) > 3 || direction < 0 && distance > 0 || direction > 0 && distance < 0)
}

fun isIncreasing(list: List<Int>): Boolean {
    val listOne = list.zipWithNext().filter { (a, b) -> a < b }
    val listTwo = list.zipWithNext().filter { (a, b) -> a > b }
    return listOne.size > listTwo.size
}