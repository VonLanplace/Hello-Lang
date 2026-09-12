package edu.fatec.lt_01_estseq

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main() {
    estSeq40();
}

// Receba 2 números inteiros.
// Verifique e mostre todos os números primos existentes entre eles.
fun estSeq40() {
    var num1 = safeInt("Insira o 1° numero.")
    var num2 = safeInt("Insira o 2° numero.")
    val mutex: Mutex = Mutex()

    if (num1 < num2) {
        val aux = num1
        num1 = num2
        num2 = aux
    }

    runBlocking {
        coroutineScope {
            for (i in num2..num1) {
                launch(Dispatchers.Default) {
                    showPrimes(i, mutex);
                }
            }
        }
    }
}

private suspend fun showPrimes(number: Int, mutex: Mutex) {
    if (isPrime(number)) {
        mutex.withLock {
            println("Primo encontrado: $number")
        }
    }
}

private fun isPrime(number: Int): Boolean {
    if (number < 1) return false
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
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
