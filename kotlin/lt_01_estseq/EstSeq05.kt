package edu.fatec.lt_01_estseq

import kotlin.math.sqrt

fun main() {
    estSeq05();
}

// Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
// Calcule e mostre as raízes reais (considerar que a equação possua 2 raízes).
fun estSeq05() {

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
        println("Não existem Raizes Reais.")
    }
}
