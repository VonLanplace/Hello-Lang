package edu.fatec.lt_01_estseq

import java.time.LocalDate
import java.time.LocalDate.parse
import java.time.Period
import java.time.format.DateTimeFormatter
import kotlin.system.exitProcess

fun main() {
    estSeq30();
}

// Receba a data de nascimento e atual em ano, mês e dia.
// Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
fun estSeq30() {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    try {
        println("Insira a Data de nascimento em dd/MM/yyyy")
        val nascimento = parse(readln(), formatter)

        //println("Insira a Data de atual em dd/MM/yyyy")
        //val atual = parse(readln(), formatter)
        val atual = LocalDate.now()

        val periodo = Period.between(nascimento, atual)

        println("Você tem ${periodo.years} anos, ${periodo.months} meses e ${periodo.days} dias de idade.")
    } catch (e: Exception) {
        println("Erro ao inserir o valor")
    }
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
