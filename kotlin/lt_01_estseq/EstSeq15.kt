package edu.fatec.lt_01_estseq

import kotlin.math.sqrt

fun main() {
    estSeq15();
}

// Receba os valores de 2 catetos de um triângulo retângulo.
// Calcule e mostre a hipotenusa.
fun estSeq15() {

    val cateto1: Double

    println("Insira o 1° cateto.")

    try {
        cateto1 = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    if (cateto1 <= 0.0) {
        println("Valor inserido inválido.")
        return
    }

    val cateto2: Double

    println("Insira o 2° cateto.")

    try {
        cateto2 = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    if (cateto2 <= 0.0) {
        println("Valor inserido inválido.")
        return
    }

    println("O 3° ângulo é ${sqrt((cateto1 * cateto1) + (cateto2 + cateto2))} dias.")
}
