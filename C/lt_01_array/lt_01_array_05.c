#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int i, vet[20];

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    vet[i] = rand() % 100;
    printf("|%.3d", vet[i]);
  }
  printf("|\n");

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    printf("|%.2d", (vet[i] - vet[(sizeof(vet) / sizeof(vet[0])) - i - 1]));
  }
  printf("|\n");
  return 0;
}
