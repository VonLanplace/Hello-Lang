#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int i, j;
  int mat[8][8], vet[8];

  for (j = 0; j < 8; j++) {
    vet[j] = 0;
  }

  for (i = 0; i < 8; i++) {
    for (j = 0; j < 8; j++) {
      mat[i][j] = rand() % 9;
      printf("|%d", mat[i][j]);
    }
    printf("|\n");
  }

  printf("\n");
  for (i = 0; i < 8; i++) {
    for (j = 0; j < 8; j++) {
      vet[mat[i][j]]++;
    }
    printf("|%.2d", i);
  }

  printf("|\n");
  for (i = 0; i < 8; i++) {
    printf("|%2.d", vet[i]);
  }
  printf("|\n");

  return 0;
}
