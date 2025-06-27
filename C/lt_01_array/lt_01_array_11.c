#include <stdio.h>

int main() {
  int size = 18, i, j, k;
  int mat[size][size];

  for (i = 0; i < size; i++) {
    for (j = 0; j < size; j++) {
      mat[i][j] = 0;
    }
  }

  for (k = 0; k < (size / 2); k++) {
    for (i = k; i < (size - k); i++) {
      for (j = k; j < (size - k); j++) {
        mat[i][j]++;
      }
    }
  }

  for (i = 0; i < size; i++) {
    for (j = 0; j < size; j++) {
      printf("|%d", mat[i][j]);
    }
    printf("|\n");
  }

  return 0;
}
