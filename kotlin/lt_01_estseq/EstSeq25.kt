package edu.fatec.lt_01_estseq

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.system.exitProcess

fun main() {
    estSeq25();
}

// Receba a hora de início e de final de um jogo (HH,MM),
// calcular o tempo do jogo em horas e minutos,
// sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
fun estSeq25() {
    try {
        println("Insira a Hora de início (HH:MM):")
        val timeStringInicio = readln()
        val inicio = LocalTime.parse(timeStringInicio, DateTimeFormatter.ofPattern("HH:mm"))

        println("Insira a Hora de final (HH:MM):")
        val timeStringFinal = readln()
        val final = LocalTime.parse(timeStringFinal, DateTimeFormatter.ofPattern("HH:mm"))

        val inicioMinutos = inicio.hour * 60 + inicio.minute
        var finalMinutos = final.hour * 60 + final.minute

        if (finalMinutos <= inicioMinutos) {
            finalMinutos += 24 * 60
        }

        val duracaoTotalMinutos = finalMinutos - inicioMinutos
        val horas = duracaoTotalMinutos / 60
        val minutos = duracaoTotalMinutos % 60

        if (horas >= 24 && minutos > 0) {
            println("Erro: O tempo do jogo deve ser menor que 24 horas.")
            return
        }

        println("O jogo durou **$horas hora(s)** e **$minutos minuto(s)**.")

    } catch (e: Exception) {
        println("Erro ao processar os horários: ${e.message}")
        return
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
