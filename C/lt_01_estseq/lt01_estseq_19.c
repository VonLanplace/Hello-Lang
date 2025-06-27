#include <stdio.h>

int main() {
  int num1, num2;

  printf("Insira u numero Inteiro: ");
  scanf("%d", &num1);

  printf("Insira u numero Inteiro: ");
  scanf("%d", &num2);

  if (num1 > num2) {

    int aux = num1;
    num1 = num2;
    num2 = aux;
  }

  printf("A diferenca entre o maior e o menor e %i.\n", num2 - num1);
}
