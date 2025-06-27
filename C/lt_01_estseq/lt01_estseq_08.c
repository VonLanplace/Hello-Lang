#include <stdio.h>
// Nome do Programador: Lucas Sartorelli
// Descição:

int main() {

  float deposito;

  printf("Insira o Valor do Depósito; ");
  scanf("%f", &deposito);

  deposito *= 1.013;

  printf("O valor apos 1 mes sera %.2f.\n", deposito);

  return 0;
}
