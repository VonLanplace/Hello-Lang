package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq24();
}

// Receba um valor inteiro.
// Verifique e mostre se é divisível por 2 e 3.
fun estSeq24() {
    val valor1 = safeInt("Insira o valor")
    val div2 = valor1 % 2 == 0
    val div3 = valor1 % 3 == 0

    if (div2 && div3)
        println("O ${valor1} é divisivel por 2")
    else if (div2)
        println("O ${valor1} é divisivel por 2")
    else if (div3)
        println("O ${valor1} é divisivel por 3")
    else
        println("O ${valor1} não é divisivel por 2 ou 3")
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
