#include <stdio.h>

int difer(int num1, int num2) {

  if (num1 > num2) {

    int aux = num1;
    num1 = num2;
    num2 = aux;
  }
  return num2 - num1;
}

int main() {

  int num1, num2;
  for (int i = 0; i < 2; i++) {

    printf("Insira um número Inteiro: ");
    if (i == 1) {
      scanf("%d", &num1);
    } else {
      scanf("%d", &num2);
    }
  }
  printf("O valor da diferença e %d.\n", difer(num1, num2));
  return 0;
}
