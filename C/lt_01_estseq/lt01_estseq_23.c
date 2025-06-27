#include <stdio.h>

void bubble(float Vet[], int length) {

  int i, j;
  float aux;
  for (i = 0; i < length; i++) {

    for (j = i + 1; j < length; j++) {

      if (*(Vet + i) > *(Vet + j)) {
        aux = *(Vet + i);
        *(Vet + i) = *(Vet + j);
        *(Vet + j) = aux;
      }
    }
  }
}

int main() {
  int i, length;
  float Vet[4];
  length = (sizeof(Vet) / sizeof(Vet[0]));

  // Input
  for (i = 0; i < length; i++) {
    printf("Insira o %d° Numero: ", i + 1);
    scanf("%f", &Vet[i]);
  }

  // Sort
  bubble(Vet, length);

  // Prints
  printf("\nOs Valores serao em ordem:\n");
  for (i = 0; i < 4; i++) {
    printf("%d° -- %.2f\n", i + 1, *(Vet + i));
  }
  return 0;
}
