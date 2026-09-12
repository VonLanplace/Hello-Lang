package edu.fatec.lt_01_array

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    array12();
}

/*
 * Carregar códigos das peças em um tabuleiro de xadrez, onde:
 * Código	1   	2	    3   	4   	5   	6	7
 * Peça	    Peão	Torre	Bispo	Cavalo	Rainha	Rei	Vazio
 * - Calcular e mostrar a soma das peças do tabuleiro.
 * - Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
 */
fun array12() {
    val l = 8
    val tabuleiro = Array(l) { Array(l) { Random.nextInt(1, 8) } }
    val vetorResp = Array(l) { 0 }

    for (linha in tabuleiro) {
        for (numero in linha) {
            vetorResp[numero]++
        }
    }

    println("O Tabuleiro")
    for (linha in tabuleiro) {
        println(linha.joinToString("\t"))
    }

    println("\nContagem de Peças")
    val nomesPecas = arrayOf("", "Peão", "Torre", "Bispo", "Cavalo", "Rainha", "Rei", "Vazio")
    for (i in 1..7) {
        println("${nomesPecas[i]}: ${vetorResp[i]}")
    }

    println("\nSoma total de elementos no tabuleiro: ${vetorResp.sum()}")
}

private fun safeInt(message: String): Int {
    val num: Int

    println(message)

    try {
        num = readln().toInt();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }

    if (num <= 0.0) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }
    return num
}


private fun safeDouble(message: String): Double {
    val num: Double

    println(message)

    try {
        num = readln().toDouble();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }

    if (num <= 0.0) {
        println("Valor inserido inválido.")
        exitProcess(0)
    }
    return num
}
