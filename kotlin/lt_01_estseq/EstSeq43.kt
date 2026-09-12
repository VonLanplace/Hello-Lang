package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq43();
}

// Calcule e mostre quantos anos serão necessários para que Ana
// seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm
// ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
fun estSeq43() {
    var anaH = 110
    val anaC = 3
    var mariaH = 150
    val mariaC = 2
    var resp = 0

    while (anaH < mariaH) {
        resp++
        anaH += anaC
        mariaH += mariaC
    }

    println("Serão necessários $resp anos.")
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
