#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int i, j, aux, vet[20];

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    vet[i] = rand() % 100;
    printf("|%d", vet[i]);
  }
  printf("|\n");

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    for (j = i; j < (sizeof(vet) / sizeof(vet[0])); j++) {
      if (vet[i] > vet[j]) {
        aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
      }
    }
  }

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    printf("|%d", vet[i]);
  }
  printf("|\n");

  return 0;
}
