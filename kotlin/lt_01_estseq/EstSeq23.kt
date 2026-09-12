package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq23();
}

// Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
// Mostre os 4 números em ordem crescente.
fun estSeq23() {
    val valor1 = safeInt("Insira o 1° valor")
    val valor2 = safeInt("Insira o 2° valor")
    val valor3 = safeInt("Insira o 3° valor")
    val valor4 = safeInt("Insira o 4° valor")

    if (valor4 > valor1)
        println("Os valores em ordem crescente sao ${valor4}, ${valor1}, ${valor2} e ${valor3}")
    else if (valor4 > valor2)
        println("Os valores em ordem crescente sao ${valor1}, ${valor4}, ${valor2} e ${valor3}")
    else if (valor4 > valor3)
        println("Os valores em ordem crescente sao ${valor1}, ${valor2}, ${valor4} e ${valor3}")
    else
        println("Os valores em ordem crescente sao ${valor1}, ${valor2}, ${valor3} e ${valor4}")
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
