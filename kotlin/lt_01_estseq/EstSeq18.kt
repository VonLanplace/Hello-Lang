package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq18();
}

// Receba 2 valores inteiros.
// Calcule e mostre o resultado da diferença do maior pelo menos valor.
fun estSeq18() {

    val valor1 = safeInt("Insira o 1° valor")
    val valor2 = safeInt("Insira o 2° valor")

    if (valor1 > valor2)
        println("O resultado da diferença do maior pelo menor valor e ${"%.2f".format(valor1 - valor2)}")
    else
        println("O resultado da diferença do maior pelo menor valor e ${"%.2f".format(valor2 - valor1)}")
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
