#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int size = 4, i, j;
  float mat[size][size];

  for (i = 0; i < size; i++) {
    for (j = 0; j < size; j++) {
      if (i == j) {
        mat[i][j] = powf(2, i + j);
      } else {
        mat[i][j] = rand() % 100;
      }
      printf("|%2.f", mat[i][j]);
    }
    printf("|\n");
  }
  return 0;
}
