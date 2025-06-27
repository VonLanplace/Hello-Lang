#include <stdio.h>

double pot(int exp) {
  int i, base = 1;
  for (i = 0; i < exp; i++) {
    base *= 2;
  }
  return base;
}

int main() {
  for (int i = 0; i <= 64; i++) {
    printf("\nCasa|%d|", i);
    printf("\nQtde|%.lf|\n", pot(i));
  }

  return 0;
}
