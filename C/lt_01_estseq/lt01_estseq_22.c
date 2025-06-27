#include <stdio.h>

int main() {
  int num1, num2;

  printf("Insira um numero inteiro: ");
  scanf("%d", &num1);
  num2 = num1;

  while (num1 == num2) {

    printf("Insira um numero inteiro: ");
    scanf("%d", &num2);
    if (num1 == num2) {
      printf("Valor Invalido!\n");
    }
  }

  if (num1 > num2) {
    printf("\n%d > %d.\n", num1, num2);
  } else {
    printf("\n%d > %d.\n", num2, num1);
  }
}
