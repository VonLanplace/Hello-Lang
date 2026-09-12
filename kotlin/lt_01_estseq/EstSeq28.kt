package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq28();
}

// Receba o preço atual e a média mensal de um produto.
// Calcule e mostre o novo preço sabendo que:
//|     |Venda Mensal	    |Preço Atual	|Preço Novo |
//|A)	|< 500	            |< 30	        |+ 10%      |
//|B)	|>= 500 e < 1000	|>= 30 e < 80	|+ 15%      |
//|C)	|>= 1000	        |>= 80	        |- 5%       |
//Obs.: para outras condições, preço novo será igual a o preço atual.
fun estSeq28() {
    var precoAtual = safeDouble("Insira o preço atual")
    val vendaMensal = safeInt("Insira a média mensal")

    if (vendaMensal >= 1000 && precoAtual < 30) {
        precoAtual *= 1.10
    } else if (vendaMensal >= 500 && precoAtual >= 30 && precoAtual < 80) {
        precoAtual *= 1.15
    } else if (vendaMensal < 500 && precoAtual >= 80) {
        precoAtual *= 0.95
    } else {
        println("O preço Não mudou")
        return
    }

    println("O novo preço e ${precoAtual}")
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
