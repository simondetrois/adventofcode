package _2024._01

fun getBothNumbers(line: String ) =  line.substring(0, line.indexOfFirst { it == ' ' }).toInt() to
        line.substring(line.indexOfLast { it == ' ' } + 1, line.length).toInt()