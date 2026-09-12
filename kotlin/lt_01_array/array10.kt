package edu.fatec.lt_01_array

import kotlin.math.pow
import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array10();
}

/*
 * Criar uma matriz [8][8] onde o programa irá carregar segundo:
 * Casa:	1	2	3	4	...
 * Valor:	1	2	4	8	...
 * Exibir Soma dos Valores
 */
fun array10() {
    val l = 8
    val base = 2.0
    val matriz43 = Array(l) { Array(l) { Random.nextLong(1, 100).toBigInteger() } }

    var counter = 0
    for (i in 0 until l) {
        for (j in 0 until l) {
            matriz43[i][j] = base.pow(counter).toBigDecimal().toBigInteger()
            counter++
        }
    }

    for (linha in matriz43) {
        println(linha.joinToString("\t"))
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
