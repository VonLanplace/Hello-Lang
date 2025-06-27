#include <stdio.h>

int makeDias(int mes) {
  switch (mes) {
  case 1:
    mes = 31;
    break;
  case 2:
    mes = 59;
    break;
  case 3:
    mes = 90;
    break;
  case 4:
    mes = 120;
    break;
  case 5:
    mes = 151;
    break;
  case 6:
    mes = 181;
    break;
  case 7:
    mes = 212;
    break;
  case 8:
    mes = 243;
    break;
  case 9:
    mes = 273;
    break;
  case 10:
    mes = 304;
    break;
  case 11:
    mes = 334;
    break;
  case 12:
    mes = 365;
    break;
  default:
    mes = 0;
    break;
  }
  return mes;
}

int makeMes(int dia) {
  int mes;

  if (dia >= 365) {
    printf("Erro Mais ou 365 Dias enviados para makeMes");
  } else if (dia >= 334) {
    mes = 11;
  } else if (dia >= 304) {
    mes = 10;
  } else if (dia >= 273) {
    mes = 9;
  } else if (dia >= 243) {
    mes = 8;
  } else if (dia >= 212) {
    mes = 7;
  } else if (dia >= 181) {
    mes = 6;
  } else if (dia >= 151) {
    mes = 5;
  } else if (dia >= 120) {
    mes = 4;
  } else if (dia >= 90) {
    mes = 3;
  } else if (dia >= 59) {
    mes = 2;
  } else if (dia >= 31) {
    mes = 1;
  } else {
    mes = 0;
  }
  return mes;
}

int main() {
  int dia, mes, ano, nascimento, atual, biss;

  do {
    printf("Insira a data de Nascimento em DD:MM:YY : ");
    scanf("%d:%d:%d", &dia, &mes, &ano);

    nascimento = ano * 365;
    nascimento += dia;
    nascimento += makeDias(mes);
    biss = ((ano / 4) - (ano / 100) + (ano / 400));
    nascimento += biss;
  } while (nascimento <= 0);

  do {
    printf("Insira a data Atua em DD:MM:YYYY : ");
    scanf("%d:%d:%d", &dia, &mes, &ano);

    atual = ano * 365;
    atual += dia;
    atual += makeDias(mes);
    atual += ((ano / 4) - (ano / 100) + (ano / 400));
  } while ((nascimento > atual) || (atual <= 0));

  biss = ((ano / 4) - (ano / 100) + (ano / 400)) - biss;
  atual = atual - biss - nascimento;

  ano = atual / 365;
  atual = atual % 365;
  mes = makeMes(atual);
  atual -= makeDias(mes);
  dia = atual;

  printf("Tem %.2d Anos %.2d Messes e %.2d Dias de Idade.\n", ano, mes, dia);
  return 0;
}
