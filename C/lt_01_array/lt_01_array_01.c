#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  int vet[50], i, num, soma = 0;
  double media = 0;
  srand(time(NULL));

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    /*printf("Insira um numero: ");
    scanf("%d", &vet[i]);*/
    vet[i] = rand() % 100;
  }

  for (i = 0; i < (sizeof(vet) / sizeof(vet[0])); i++) {
    printf("|%d", vet[i]);
    if ((vet[i] > 10) && (vet[i] < 200)) {
      media += vet[i];
      num++;
    }
    if (vet[i] % 2 == 1) {
      soma += vet[i];
    }
  }
  printf("|\n");
  media /= num;

  printf("A media dos valores e %.2lf.\nA soma dos inpares e %d.\n", media,
         soma);
  return 0;
}
