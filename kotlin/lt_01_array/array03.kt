package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array03();
}

//Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3].
//Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P.
//Ex:
//VT1	1	2	3	-	-	-
//VT2   -   -   -   4	5	6
//VT3	1	2	3	4	5	6
fun array03() {
    val VT1 = arrayOf(1, 2, 3)
    val VT2 = arrayOf(4, 5, 6)
    val VT3 = VT1 + VT2

    println("VT1: ${VT1.joinToString(", ")}")
    println("VT2: ${VT2.joinToString(", ")}")
    println("VT3: ${VT3.joinToString(", ")}")
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
