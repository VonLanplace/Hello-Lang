package edu.fatec.lt_01_estseq

import java.math.BigInteger
import kotlin.system.exitProcess

fun main() {
    estSeq39();
}

// Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
// Casa | 1 | 2 | 3 | 4 | ... | 64
// Qdte | 1 | 2 | 4 | 8 | ... |  N
fun estSeq39() {
    val nEsimo = 64
    var resp: BigInteger = BigInteger.ZERO
    for (i in 1..nEsimo) {
        resp += BigInteger.ONE shl (i - 1)
    }
    println("O Tabuleiro Contem ${resp} grãos")
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
