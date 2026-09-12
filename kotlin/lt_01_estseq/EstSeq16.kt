package edu.fatec.lt_01_estseq

import kotlin.system.exitProcess

fun main() {
    estSeq16();
}

// Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
// Calcule o salário que serão as horas trabalhadas x o valor por hora.
// Calcule o salário líquido (= Salário Bruto – desconto).
// A cada dependente será acrescido R$ 100 no Salário Líquido.
// Exiba o salário a receber.
fun estSeq16() {

    val horas = safeInt("Insira as Horas trabalhadas")
    val valor = safeDouble("Insira o valor por hora")
    val desconto = safeDouble("Insira o valor do desconto")
    val descendentes = safeInt("Insira o numero de descendentes")

    var resposta: Double

    resposta = horas * valor
    resposta -= desconto
    resposta += 100 * descendentes

    println("O salario a receber e ${"%.2f".format(resposta)}")
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
