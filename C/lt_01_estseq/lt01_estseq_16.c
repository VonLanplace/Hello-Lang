#include <stdio.h>

int main() {

  float result, aux;
  do {

    printf("Insira a Quantidade de Horas Trabalhadas: ");
    scanf("%f", &aux);
    if (aux <= 0) {

      printf("Valor Invalido!\n");
    }

  } while (aux <= 0);
  result = aux;

  do {

    printf("Insira o Valor por Hora: ");
    scanf("%f", &aux);
    if (aux <= 0) {

      printf("Valor Invalido!\n");
    }

  } while (aux <= 0);
  result *= aux;

  do {

    printf("Insira o Valor do Desconto: ");
    scanf("%f", &aux);
    if (aux <= 0) {

      printf("Valor Invalido!\n");
    }

  } while (aux <= 0);
  result -= aux;

  do {

    printf("Insira o numero de Dependentes: ");
    scanf("%f", &aux);
    if (aux <= 0) {

      printf("Valor Invalido!\n");
    }

  } while (aux <= 0);
  result += (aux * 100);

  printf("O salario a receber e %.2f R$.\n", result);
  return 0;
}
