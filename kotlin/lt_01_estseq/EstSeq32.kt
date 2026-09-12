package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq32();
}

// Receba um número inteiro. Calcule e mostre o seu fatorial.
fun estSeq32() {
    val num = safeInt("Insira um número inteiro.")
    print("Seu fatorial é ")
    var resp = num
    for (i in 1..num - 1) {
        resp *= i
    }
    print("${resp}.\n")
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
