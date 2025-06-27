#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int size = 8, i, j, k = 0;
  float mat[size][size];

  for (i = 0; i < size; i++) {
    for (j = 0; j < size; j++) {
      mat[i][j] = powf(2, k);
      k++;
      printf("|%.f", mat[i][j]);
    }
    printf("|\n");
  }
  return 0;
}
