package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq41();
}

// Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
fun estSeq41() {
    val valorEsperado = 7

    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == valorEsperado)
                println("Os dados $i + $j é $valorEsperado")
        }
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
