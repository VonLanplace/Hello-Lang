#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int vet[100], maior, menor, i;
  double media = 0.0;

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    vet[i] = rand() % 100;
    printf("|%d", vet[i]);
  }

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    if (i == 0) {
      maior = vet[i];
      menor = vet[i];

    } else {
      if (maior < vet[i]) {
        maior = vet[i];

      } else if (menor > vet[i]) {
        menor = vet[i];
      }
    }
    media += vet[i];
  }

  media /= (sizeof(vet) / sizeof(vet[0]));

  printf("\n\nA media e %.2lf.\nO menor e %d e o maior %d.\n", media, menor,
         maior);
  return 0;
}
