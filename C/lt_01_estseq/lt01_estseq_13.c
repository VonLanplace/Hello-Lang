// Nome do Programador:
// Descrição:
#include <stdio.h>

int main() {

  float kilos;

  do {

    printf("Insira o peso em Kg: ");
    scanf("%f", &kilos);
    if (kilos < 0) {

      printf("Peso inválido!\n");
    }

  } while (kilos < 0);

  kilos = (kilos * 1000) / 50;

  printf("A comida durara por %.2f dias.\n", kilos);

  return 0;
}
