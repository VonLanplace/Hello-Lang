package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq45();
}

// Calcule e mostre a série 1/1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
fun estSeq45() {
    val nEsimo = 15
    var resp = 0.0
    for (i in 1..nEsimo) {
        val termo = i.toDouble() / (i * i)
        if (i % 2 == 0) {
            resp -= termo
        } else {
            resp += termo
        }
    }

    println("O valor da série e ${resp}")
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
