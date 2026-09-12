package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq38();
}

// Receba 100 números inteiros reais.
// Verifique e mostre o maior e o menor valor.
// Obs.: somente valores positivos.
fun estSeq38() {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var i = 0

    while (i < 100) {
        val entrada = safeInt("Insira o ${i + 1}° numero:")
        if (entrada < 0) {
            i -= 1
            println("Valor inválido. Insira um número positivo.")
        } else {
            if (entrada > max) {
                max = entrada
            }
            if (entrada < min) {
                min = entrada
            }
            i++
        }
    }
    
    println("O maior valor é: $max")
    println("O menor valor é: $min")
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
