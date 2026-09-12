package edu.fatec.lt_01_estseq

import kotlin.math.PI

fun main() {
    estSeq11();
}

// Receba o raio de uma circunferência.
// Calcule e mostre o comprimento da circunferência.
fun estSeq11() {

    var r: Double

    println("Insira o raio da circunferência.")

    try {
        r = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("A circunferência é ${"%.2f".format(2 * PI * r)}")
}
