#include <stdio.h>
void mame(int *num1, int *num2) {
  if (*num1 > *num2) {
    int aux = *num1;
    *num1 = *num2;
    *num2 = aux;
  }
}

int main() {
  int num1, num2, i, j;

  printf("Insira o valor do primeiro numero: ");
  scanf("%d", &num1);

  printf("Insira o valor do primeiro numero: ");
  scanf("%d", &num2);

  mame(&num1, &num2);

  for (i = num1 + 1; i < num2; i++) {
    for (j = 2; j <= i; j++) {
      if (j == i) {
        printf("%d e primo.\n", i);
      } else if (i % j == 0) {
        break;
      }
    }
  }

  return 0;
}
