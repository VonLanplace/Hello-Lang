#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int mat[4][3], i, j;
  int total = 0;

  for (i = 0; i < 4; i++) {
    for (j = 0; j < 3; j++) {
      mat[i][j] = rand() % 10;
      printf("|%.2d", mat[i][j]);
    }
    printf("|\n");
  }
  printf("\n");

  for (i = 0; i < 4; i++) {
    for (j = 0; j < 3; j++) {
      total += mat[i][j];
    }
  }
  printf("O total do mes e %d.\n", total);
  printf("\n");

  for (i = 0; i < 4; i++) {
    total = 0;
    for (j = 0; j < 3; j++) {
      total += mat[i][j];
    }
    printf("O total da semana %d e %d.\n", i + 1, total);
  }
  printf("\n");

  for (i = 0; i < 3; i++) {
    total = 0;
    for (j = 0; j < 4; j++) {
      total += mat[j][i];
    }
    printf("O total do produto %d e %d.\n", i + 1, total);
  }
  printf("\n");

  return 0;
}
