#include <stdio.h>
int main() {
  int d1, d2;

  printf("A soma será 7 quando.\n");

  for (d1 = 1; d1 <= 6; d1++) {
    for (d2 = 6; d2 > 0; d2--) {
      if (d1 + d2 == 7) {
        printf("Se o 1° Dado for %d e o 2° Dado for %d.\n", d1, d2);
      }
    }
  }

  return 0;
}
