package edu.fatec.lt_01_estseq

fun main() {
    estSeq06();
}

// Receba os valores em x e y.
// Efetua a troca de seus valores e mostre seus conteúdos.
fun estSeq06() {

    var x: Double

    println("Insira o valor de X.")

    try {
        x = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    var y: Double

    println("Insira o valor de Y.")

    try {
        y = readlnOrNull()?.toDouble() ?: -1.0;
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("O valor de X era ${x} e o valor de Y era ${y}.")

    val z = x
    x = y
    y = x

    println("O valor de X virou ${x} e o valor de Y era ${y}.")
}
