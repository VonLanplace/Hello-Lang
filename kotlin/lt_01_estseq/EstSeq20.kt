package edu.fatec.lt_01_estseq

import kotlin.math.sqrt

fun main() {
    estSeq20();
}

// Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula ax^2+bx+c=0.
// Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
fun estSeq20() {

    println("Insira o valor de A da equacao.")
    val axx: Double
    try {
        axx = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("Insira o valor de B da equacao.")
    val bx: Double
    try {
        bx = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("Insira o valor de C da equacao.")
    var c: Double
    try {
        c = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    c = (bx * bx) - (4 * axx * c)
    if (c > 0) {
        println("x' = ${"%.2f".format((-bx + sqrt(c) / (2 * axx)))}.")
        println("x\" = ${"%.2f".format((-bx - sqrt(c) / (2 * axx)))}.")
    } else if (c == 0.0) {
        println("x = ${"%.2f".format((-bx) / (2 * axx))}.")
    } else {
        println("x' = ${-bx} + ${"%.2f".format(sqrt(-c))} / ${2 * axx}.")
        println("x\" = ${-bx} - ${"%.2f".format(sqrt(-c))} / ${2 * axx}.")
    }
}
