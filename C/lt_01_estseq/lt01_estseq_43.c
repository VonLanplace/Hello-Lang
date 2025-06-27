#include <stdio.h>

int main() {
  float ana = 1.1, maria = 1.5;
  int anos = 0;

  while (ana <= maria) {
    ana += 0.03;
    maria += 0.02;
    anos++;
  }

  printf("Demorará %d Anos.\n", anos);

  return 0;
}
