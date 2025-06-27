#include <stdio.h>

int main() {
  float top = 1, bottom = 1;
  int num, i;
  double soma = 0.0;

  printf("Insira o numero de elementos da serie: ");
  scanf("%d", &num);

  for (i = 0; i < num; i++) {
    soma += top / bottom;
    top += 1;
    bottom += 2;
  }

  printf("O valor %d da serie sera %.2lf.\n", num, soma);
  return 0;
}
