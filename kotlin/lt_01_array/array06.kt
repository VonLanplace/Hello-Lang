package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array06();
}

/*
 * Criar e coletar em um vetor [20] com números aleatórios.
 * Classificar este vetor em ordem crescente e mostre os dados.
 */
fun array06() {
    val vetor20 = IntArray(20) { Random.nextInt(1, 100) }

    println("Vetor gerado: ${vetor20.contentToString()}")
    vetor20.sort()
    println("Vetor ordenado: ${vetor20.contentToString()}")
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
