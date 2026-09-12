package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq21();
}

// Receba 4 notas bimestrais de um aluno.
// Calcule e mostre a média aritmética.
// Mostre a mensagem de acordo com a média:
//      a. Se a média for >= 6,0 exibir “APROVADO”;
//      b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
//      c. Se a média for < 3,0 exibir “RETIDO”.
fun estSeq21() {

    var resposta: Double = 0.0

    for (i in 1..4) {
        val valor = safeDouble("Insira o ${i}° valor")
        resposta += valor
    }

    resposta /= 4.0
    if (resposta >= 6.0)
        println("APROVADO")
    else if (resposta >= 3.0)
        println("EXAME")
    else
        println("RETIDO")
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
