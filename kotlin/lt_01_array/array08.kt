package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array08();
}

/*
 * Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas.
 * Calcular e exibir:
 *  a. A quantidade de cada produto vendido no mês;
 *  b. A quantidade de produtos vendidos por semana;
 *  c. O total de produtos vendidos no mês.
 */
fun array08() {
    val matriz43 = Array(4) { Array(3) { Random.nextInt(1, 100) } }

    println("a. Quantidade de cada produto vendido no mês:")
    for (j in 0 until matriz43.get(0).size) {
        var totalProduto = 0
        for (i in matriz43.indices) {
            totalProduto += matriz43.get(i).get(j)
        }
        println("Produto ${j + 1}: $totalProduto unidades")
    }
    println()

    println("b. Quantidade de produtos vendidos por semana:")
    for (i in matriz43.indices) {
        var totalSemana = 0
        for (j in matriz43[i].indices) {
            totalSemana += matriz43[i][j]
        }
        println("Semana ${i + 1}: $totalSemana unidades")
    }
    println()

    var totalMes = 0
    for (i in matriz43.indices) {
        for (j in matriz43[i].indices) {
            totalMes += matriz43[i][j]
        }
    }
    println("c. Total geral de produtos vendidos no mês: $totalMes unidades")
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
