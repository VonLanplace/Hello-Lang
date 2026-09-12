package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq37();
}

// Receba um número inteiro.
// Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
fun estSeq37() {
    val nEsimo = safeInt("Insira um número.")

    var casa1 = 0
    var casa2 = 1

    println("A série de Fibonacci até o seu ${nEsimo} termo:")
    print("\t")
    if (nEsimo == 1) {
        print("0")
    } else {
        for (i in 2..nEsimo) {
            print("${casa2}, ")
            val aux = casa1
            casa1 = casa2
            casa2 += aux
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
