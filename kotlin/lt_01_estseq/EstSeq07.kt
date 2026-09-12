package edu.fatec.lt_01_estseq

fun main() {
    estSeq07();
}

// Receba os valores do comprimento, largura e altura de um paralelepípedo.
// Calcule e mostre seu volume.
fun estSeq07() {

    var comprimento: Double

    println("Insira o valor do comprimento.")

    try {
        comprimento = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    var largura: Double

    println("Insira o valor da largura.")

    try {
        largura = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    var altura: Double

    println("Insira o valor da altura.")

    try {
        altura = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("A area é ${"%.2f".format(comprimento * largura * altura)}")
}
