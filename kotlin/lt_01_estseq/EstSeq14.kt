package edu.fatec.lt_01_estseq

fun main() {
    estSeq14();
}

// Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
fun estSeq14() {

    val angulo1: Double

    println("Insira o 1° ângulo.")

    try {
        angulo1 = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    if (angulo1 <= 0.0) {
        println("Valor inserido inválido.")
        return
    }

    val angulo2: Double

    println("Insira o 2° ângulo.")

    try {
        angulo2 = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    if (angulo2 <= 0.0) {
        println("Valor inserido inválido.")
        return
    }

    println("O 3° ângulo é ${(180 - angulo1) - angulo2} dias.")
}
