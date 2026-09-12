package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array05();
}

/*
 * 5. Criar e coletar em um vetor [20] inteiro.
 * Calcule e exiba, segundo: sum_{i=1}^{10} (A[i] - A[21-i])
 */
fun array05() {
    val vetor30 = IntArray(20) { Random.nextInt(1, 100) }

    println("Vetor gerado: ${vetor30.contentToString()}")

    for (i in 0 until vetor30.size) {
        val resp = vetor30[i] - vetor30[vetor30.size - 1 - i]
        println("i = ${i + 1}: A[${i + 1}] (${vetor30[i]}) - A[${vetor30.size - i}] (${vetor30[vetor30.size - 1 - i]}) = $resp")
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
