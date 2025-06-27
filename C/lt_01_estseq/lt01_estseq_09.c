// Nome Do programador:
// Descrição:
#include <stdio.h>

int main() {

  double num1, num2;

  printf("Insira um Número: ");
  scanf("%lf", &num1);
  printf("Insira um Número: ");
  scanf("%lf", &num2);

  num1 *= num1;
  num2 *= num2;
  num1 += num2;

  printf("O valor da soma dos quadrados é %.2f.\n", num1);
  return 0;
}
