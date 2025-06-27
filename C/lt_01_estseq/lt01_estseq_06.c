#include <stdio.h>

int main() {

  float X, Y, aux;

  printf("Insira o Valor de X: ");
  scanf("%f", &X);
  printf("Insira o Valor de Y: ");
  scanf("%f", &Y);

  aux = X;
  X = Y;
  Y = aux;

  printf("O valor de X e %.2f.\nO Valor de Y e %.2f.\n", X, Y);
  return 0;
}
