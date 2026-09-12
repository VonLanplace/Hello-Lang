package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq34();
}

// Receba um número.
// Calcule e mostre os resultados da tabuada desse número.
fun estSeq34() {
    val num = safeInt("Insira um número.")
    println("A tabuada de ${num}:")
    for (i in 1..10) {
        println("\t${num}X${i} = ${num * i}")
    }
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
