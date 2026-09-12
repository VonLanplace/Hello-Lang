package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array04();
}

//Criar e coletar em um vetor [30] real e calcular e exibir:
//a. A média do grupo;
//b. A quantidade de notas acima da média do grupo;
//c. As posições dos valores abaixo da média do grupo.
fun array04() {
    val vetor30 = Array(30) { Random.nextInt(1, 100) }

    val posicoes = mutableListOf<Int>()
    val media = vetor30.average()
    var acimaMedia = 0
    for (i in vetor30.indices) {
        if (vetor30[i] >= media) {
            acimaMedia++
        } else {
            posicoes.add(i)
        }
    }

    println("Vetor gerado: ${vetor30.contentToString()}")
    println("a. Média do grupo: $media")
    println("b. Quantidade de notas acima da média: $acimaMedia")
    println("c. Posições dos valores abaixo da média: $posicoes")
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
