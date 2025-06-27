#include <stdio.h>

int main() {
  float base, altura;
  printf("\nInsira o Valor da Base: ");
  scanf("%f", &base);
  printf("\nInsira o Valor da Altura: ");
  scanf("%f", &altura);
  base *= altura;
  base /= 2;
  printf("\nO valor da Area e %.0f", base);
  return 0;
}
