package edu.fatec.lt_01_array

import kotlin.system.exitProcess

fun main() {
    array11();
}

/*
 * Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 * 1	1	1	1	1	1	1	1
 * 1	2	2	2	2	2	2	1
 * 1	2	3	3	3	3	2	1
 * 1	2	3	4	4	3	2	1
 * 1	2	3	4	4	3	2	1
 * 1	2	3	3	3	3	2	1
 * 1	2	2	2	2	2	2	1
 * 1	1	1	1	1	1	1	1
 */
fun array11() {
    val l = 9
    val matriz88 = Array(l) { Array(l) { 0 } }

    for (n in 0..l / 2) {
        for (i in 0 + n until l - n) {
            for (j in 0 + n until l - n) {
                matriz88[i][j]++
            }
        }
    }

    for (linha in matriz88) {
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
