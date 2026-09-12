package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq26();
}

// Receba 2 números inteiros.
// Verifique e mostre se o maior número é múltiplo do menor.
fun estSeq26() {
    var num1 = safeInt("Insira o 1° Valor")
    var num2 = safeInt("Insira o 2° Valor")

    if (num1 < num2) {
        val aux = num1
        num1 = num2
        num2 = aux
    }

    if (num1 % num2 == 0)
        println("O maior número é multiplo do menor.")
    else
        println("O maior número não é multiplo do menor.")

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
