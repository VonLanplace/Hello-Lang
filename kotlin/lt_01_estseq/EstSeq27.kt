package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq27();
}

// Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
// Calcule e mostre a velocidade média em km/h.
fun estSeq27() {
    val voltas = safeInt("Insira o número de voltas")
    var metros = safeInt("Insira a extensão do circuito (em metros)")
    val minutos = safeInt("Insira o tempo de duração (minutos)")

    metros *= voltas
    println("A velocidade média foi ${metros / minutos}")
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
