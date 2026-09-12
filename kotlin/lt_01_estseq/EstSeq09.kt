package edu.fatec.lt_01_estseq

fun main() {
    estSeq09();
}

// Receba os 2 números inteiros.
// Calcule e mostre a soma dos quadrados.
fun estSeq09() {

    var num1: Int

    println("Insira o primeiro numero.")

    try {
        num1 = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    var num2: Int

    println("Insira o segundo numero.")

    try {
        num2 = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("A soma dos quadrados é ${(num1 * num1) + (num2 * num2)}")
}
