package edu.fatec.lt_01_estseq

fun main() {
    estSeq04();
}

// Receba a temperatura em graus Celsius.
// Calcule e mostre a sua temperatura convertida em fahrenheit
// F = (9*C+160) /5.
fun estSeq04() {
    var c: Double
    println("Insira a temperatura em Celsius.")

    try {
        c = readlnOrNull()?.toDouble() ?: -300.00;
    } catch (e: NumberFormatException) {
        c = -300.00
    }

    if (c <= -273.15) {
        println("Valor inserido inválido.")
        return
    }

    println("A temperatura em Fahrenheit é ${"%.2f".format(((9 * c) / 5) + 32)}.")
}
