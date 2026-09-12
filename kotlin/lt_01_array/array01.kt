package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array01();
}

//Criar e coletar um vetor [50] inteiro. Calcular e exibir:
//a. A média dos valores entre 10 e 200;
//b. A soma dos números ímpares.
fun array01() {
    val vetor50 = Array(50) { 0 }
    fillVector(vetor50)

    var count = 0
    var media = 0.0
    var sum = 0

    for (i in vetor50) {
        if (200 > i && i > 10) {
            count++
            media += i
        }
        if (i % 2 != 0) {
            sum += i
        }
    }

    if (count > 0) {
        media /= count
        println("a. A média dos valores entre 10 e 200 é: $media")
    } else {
        println("a. Nenhum valor entre 10 e 200 foi encontrado no vetor.")
    }

    println("b. A soma dos números ímpares é: $sum")
}

private fun fillVector(vector: Array<Int>) {
    for (i in vector.indices) {
        vector[i] = Random.nextInt(1, 1000)
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
