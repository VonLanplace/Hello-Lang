package edu.fatec.lt_01_array

import java.util.Arrays.binarySearch
import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array07();
}

/*
 * Criar e coletar em um vetor [20] com números aleatórios.
 * a. Classificar este vetor em ordem crescente e mostre os dados.
 * b. Solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
 */
fun array07() {
    val vetor20 = IntArray(20) { Random.nextInt(1, 100) }

    println("Vetor gerado: ${vetor20.contentToString()}")
    vetor20.sort()
    println("a. Vetor ordenado em ordem crescente: ${vetor20.contentToString()}")

    val procurado = safeInt("Insira o valor a ser procurado: ")

    val index = binarySearch(vetor20, procurado)
    if (index >= 0) {
        println("b. Valor $procurado encontrado na posição $index do vetor.")
    } else {
        println("b. Valor $procurado não foi encontrado no vetor!")
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
