package edu.fatec.lt_01_estseq

fun main() {
    estSeq12();
}

// Receba o ano de nascimento e o ano atual.
// Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
fun estSeq12() {

    var nascimento: Int

    println("Insira o ano de nascimento.")

    try {
        nascimento = readln().toInt();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    println("Insira o ano atual.")

    var atual: Int

    try {
        atual = readln().toInt();
    } catch (e: NumberFormatException) {
        println("Valor inserido inválido.")
        return
    }

    if (nascimento > atual) {
        println("Valor inserido inválido.")
        return
    } else {
        println("A idade é ${atual - nascimento} e terá ${atual - nascimento + 17} daqui a 17 anos.")
    }
}
