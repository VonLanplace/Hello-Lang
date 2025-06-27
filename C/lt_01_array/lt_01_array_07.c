#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void search(int *vet, int min, int max, int find) {
  int media = (((max - min) / 2) + min);

  if (min != media) {
    int media = (((max - min) / 2) + min);
    if (*(vet + media) == find) {

      printf("O valor %d foi encontrado!\n", find);
    } else if (*(vet + media) < find) {

      printf("|%d", *(vet + media));
      printf("|%d|%d|%d|\n", min, media, max);
      search(vet, media, max, find);

    } else if (*(vet + media) > find) {

      printf("|%d", *(vet + media));
      printf("|%d|%d|%d|\n", min, media, max);
      search(vet, min, media, find);
    }
  } else {
    if (*(vet + media) == find) {

      printf("O valor %d foi encontrado!\n", find);
    } else {

      printf("O valor %d não foi encontrado!\n", find);
    }
  }
}

int main() {
  srand(time(NULL));
  int i, j, aux, vet[6];

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

  printf("Insira o valor a ser procurado: ");
  scanf("%d", &aux);
  search(vet, 0, (sizeof(vet) / sizeof(vet[0])), aux);

  return 0;
}
