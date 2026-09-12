package edu.fatec.lt_01_estseq

fun main() {
    estSeq02();
}

// Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
fun estSeq02() {
    var l: Double
    println("Insira o salário do funcionário.")

    try {
        l = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        l = -1.0
    }

    if (l <= 0) {
        println("Valor inserido inválido.")
        return
    }

    println("O novo salário é ${"%.2f".format(l * 1.15)}.")
}
