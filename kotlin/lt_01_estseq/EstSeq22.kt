package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq22();
}

// Receba 2 valores inteiros e diferentes.
// Mostre seus valores em ordem crescente.
fun estSeq22() {
    val valor1 = safeInt("Insira o 1° valor")
    val valor2 = safeInt("Insira o 2° valor")

    if (valor1 > valor2)
        println("Os valores em ordem crescente sao ${valor1} e ${valor2}")
    else
        println("Os valores em ordem crescente sao ${valor2} e ${valor1}")
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
