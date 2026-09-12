package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq31();
}

// Calcule e mostre o quadrado dos números entre 10 e 150.
fun estSeq31() {
    val min = 10
    val max = 150

    println("O quadrado dos números entre ${min} e ${max};")
    print("\t")
    for (n in min..max) {
        print("${n * n}, ")
    }
    print("\n")
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
