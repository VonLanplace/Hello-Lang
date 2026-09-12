package edu.fatec.lt_01_estseq

fun main() {
    estSeq01();
}

// Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
fun estSeq01() {
    var l: Int
    println("Insira o valor do lado.")

    try {
        l = readlnOrNull()?.toInt() ?: -1;
    } catch (e: NumberFormatException) {
        l = -1
    }

    if (l <= 0) {
        println("Valor inserido inválido.")
        return
    }

    println("A área do Quadrado é ${l * l}.")
}
