package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq44();
}

// Receba o número da base e do expoente.
// Calcule e mostre o valor da potência.
fun estSeq44() {
    val base = safeDouble("Insira o valor da base")
    val expoente = safeDouble("Insira o valor da expoente")

    println("O valor da potência é ${Math.pow(base, expoente)}")
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
