package edu.fatec.lt_01_estseq

fun main() {
    estSeq03();
}

// Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
fun estSeq03() {
    var b: Double

    println("Insira o valor da base.")

    try {
        b = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        b = -1.0
    }

    if (b <= 0) {
        println("Valor inserido inválido.")
        return
    }

    var a: Double

    println("Insira o valor da altura.")

    try {
        a = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        a = -1.0
    }

    if (a <= 0) {
        println("Valor inserido inválido.")
        return
    }

    println("A altura é ${"%.2f".format((b * a) / 2)}.")
}
