#include <stdio.h>

int main() {
  double salario;
  printf("Insira o salario oiginal: ");
  scanf("%lf", &salario);
  salario *= 1.15;
  printf("O salario reajsutado e %.2lf", salario);
  return 0;
}
