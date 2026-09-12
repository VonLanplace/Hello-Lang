package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq35();
}

// Receba 2 números inteiros, verifique qual o maior entre eles.
// Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
fun estSeq35() {
    var num1 = safeInt("Insira um número.")
    var num2 = safeInt("Insira um número.")

    if (num1 > num2) {
        val aux = num2
        num2 = num1
        num1 = aux
    }

    var resp = 0
    for (i in num1..num2)
        if (i % 2 != 0)
            resp += i

    println("O resultado da somatória dos números ímpares e ${resp}")
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
