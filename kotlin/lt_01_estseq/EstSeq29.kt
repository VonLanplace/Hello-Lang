package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq29();
}

// Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
// Calcule e mostre o Valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
// Demais tipos não serão considerados.
fun estSeq29() {
    var correcao: Double
    run {
        var tipo = safeInt("Insira o tipo de investimento")
        correcao = when (tipo) {
            1 -> 0.03
            2 -> 0.05
            else -> {
                println("Tipo não configurado")
                return
            }
        }
    }
    val valor = safeInt("Insira o preço atual")

    println("O valor corrigido é ${correcao * valor}")
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
