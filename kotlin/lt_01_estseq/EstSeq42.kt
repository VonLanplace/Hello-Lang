package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq42();
}

// Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
fun estSeq42() {
    val nEsimo = 50
    var base = 1.0
    var topo = 1.0
    var resposta = 0.0

    while (topo <= nEsimo) {
        resposta += topo / base
        base += 2.0
        topo += 1.0
    }

    println("O valor da série e ${resposta}")
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
