package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array02();
}

//Criar e coletar um vetor [100] inteiro e exibir:
//a. O maior e o menor valor;
//b. A média dos valores.
fun array02() {
    val vetor100 = Array(100) { 0 }
    fillVector(vetor100)

    var maior = Int.MIN_VALUE
    var menor = Int.MAX_VALUE
    var media = 0.0

    for (i in vetor100) {
        if (i > maior) maior = i
        if (i < menor) menor = i
        media += i
    }

    if (vetor100.isNotEmpty()) {
        media /= vetor100.size
    }

    println("a. O maior valor é: $maior e o menor valor é: $menor")
    println("b. A média dos valores é: $media")
}

private fun fillVector(vector: Array<Int>) {
    for (i in vector.indices) {
        vector[i] = Random.nextInt(1, 1000)
    }
}

private fun fillVector(vector: Array<Double>) {
    for (i in vector.indices) {
        vector[i] = Random.nextDouble(1.0, 1000.0)
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
