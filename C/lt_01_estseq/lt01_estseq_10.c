#include <stdio.h>

int main() {

  int num1, num2;

  printf("Insira o primeiro numero: ");
  scanf("%i", &num1);

  printf("Insira o segundo numero: ");
  scanf("%i", &num2);

  if (num2 > num1) {
    num1 = num2 - num1;
  } else {
    num1 -= num2;
  }

  printf("A diferenca e %i.\n", num1);
  return 0;
}
