package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq17();
}

// Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
// Receber o tempo de percurso e a velocidade média.
fun estSeq17() {

    val tempo = safeInt("Insira o tempo de percurso")
    val velocidade = safeDouble("Insira a velocidade média")

    var resposta: Double

    resposta = (tempo * velocidade) / 12

    println("A quantidade de litros gastos e ${"%.2f".format(resposta)}")
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
