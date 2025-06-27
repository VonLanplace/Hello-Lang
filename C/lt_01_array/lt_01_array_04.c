#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int vetor[30], i, acima = 0, abaixo = 0, media = 0;

  for (i = 0; i < (sizeof(vetor) / sizeof(vetor[0])); i++) {
    vetor[i] = rand() % 100;
    printf("|%d", vetor[i]);
  }
  printf("|\n");

  for (i = 0; i < (sizeof(vetor) / sizeof(vetor[0])); i++) {
    media += vetor[i];
  }
  media /= (sizeof(vetor) / sizeof(vetor[0]));

  for (i = 0; i < (sizeof(vetor) / sizeof(vetor[0])); i++) {
    if (vetor[i] > media) {
      acima++;
    }
    if (vetor[i] < media) {
      abaixo++;
    }
  }

  printf("O valor da media e %d.\nA quantidade de maiores e %d.\nA "
         "quantidade de menores e %d.\n",
         media, acima, abaixo);
  return 0;
}
