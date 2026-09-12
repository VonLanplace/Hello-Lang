package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq19();
}

// Receba 2 valores reais.
// Calcule e mostre o maior deles.
fun estSeq19() {

    val valor1 = safeInt("Insira o 1° valor")
    val valor2 = safeInt("Insira o 2° valor")

    if (valor1 > valor2)
        println("O maior deles e ${"%.2f".format(valor1)}")
    else
        println("O maior deles e ${"%.2f".format(valor2)}")
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
