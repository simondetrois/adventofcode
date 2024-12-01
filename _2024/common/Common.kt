package _2024.common

import java.io.File

fun getLinesOfFile(path: String) = File(path).useLines { it.toList() }