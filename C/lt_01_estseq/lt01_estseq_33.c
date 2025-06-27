#include <stdio.h>

void serie(double *sum, int *bottom) {
  if (*bottom > 0) {
    *sum += (1.0 / *bottom);
    *bottom -= 1;
    serie(sum, bottom);
  }
}

int main() {
  double sum = 0;
  int num = 0;
  printf("Insira o valor de N: ");
  scanf("%d", &num);

  serie(&sum, &num);

  printf("O valor da serie sera %.2lf.\n", sum);
  return 0;
}
