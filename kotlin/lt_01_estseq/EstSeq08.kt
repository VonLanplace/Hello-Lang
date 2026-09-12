package edu.fatec.lt_01_estseq

fun main() {
    estSeq08();
}

// Receba o valor de um depósito em poupança.
// Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
fun estSeq08() {

    var deposito: Double

    println("Insira o valor do depósito.")

    try {
        deposito = readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("A area é ${"%.2f".format(deposito * 1.013)}")
}
