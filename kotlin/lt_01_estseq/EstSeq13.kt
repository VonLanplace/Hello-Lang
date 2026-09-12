package edu.fatec.lt_01_estseq

fun main() {
    estSeq13();
}

// Receba a quantidade de alimento em quilos.
// Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
fun estSeq13() {

    val quantidade: Int

    println("Insira a quantidade.")

    try {
        quantidade = readln().toInt();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("O alimento durará ${(quantidade * 1000) / 50} dias.")
}
