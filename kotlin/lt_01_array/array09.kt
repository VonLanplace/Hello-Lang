package edu.fatec.lt_01_array

import kotlin.math.pow
import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array09();
}

/*
 * Criar e carregar uma matriz [4][4] com valores aleatórios,
 * sendo que a diagonal principal terá seus dados carregados no programa segundo:
 * 1	-	--	--
 * -	4	--	--
 * -	-	16	--
 * -	-	--	64
 */
fun array09() {
    val l = 4
    val base = 2.0
    val matriz43 = Array(l) { Array(l) { Random.nextInt(1, 100) } }

    for (i in 0 until l) {
        for (j in 0 until l) {
            if (i == j)
                matriz43[i][j] = base.pow(i + j).toInt()
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
