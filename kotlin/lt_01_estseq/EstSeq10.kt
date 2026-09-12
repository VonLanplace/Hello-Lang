package edu.fatec.lt_01_estseq

fun main() {
    estSeq10();
}

// Receba 2 números reais.
// Calcule e mostre a diferença desses valores.
fun estSeq10() {

    var num1: Double

    println("Insira o primeiro numero.")

    try {
        num1 = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    var num2: Double

    println("Insira o segundo numero.")

    try {
        num2 = readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }
    
    if (num1 > num2)
        println("A diferença é ${"%.2f".format(num1 - num2)}")
    else
        println("A diferença é ${"%.2f".format(num2 - num1)}")
}
