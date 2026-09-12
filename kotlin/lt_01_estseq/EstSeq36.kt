package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq36();
}

// Receba um número N.
// Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
fun estSeq36() {
    val num = safeInt("Insira um número.")
    var resp: Double = 0.0
    for (i in 1..num) {
        resp += 1 / fat(i)
    }
    print("A série resulta em ${resp}.")
}

private fun fat(num: Int): Int {
    var resp = num
    for (i in 1..num - 1) {
        resp *= i
    }
    return resp
}

private fun safeInt(message: String): Int {
    val num: Int

    println(message)

    try {
        num = readln().toInt();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }

    if (num <= 0.0) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }
    return num
}


private fun safeDouble(message: String): Double {
    val num: Double

    println(message)

    try {
        num = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }

    if (num <= 0.0) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }
    return num
}
