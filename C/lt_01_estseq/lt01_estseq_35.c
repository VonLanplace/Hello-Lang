#include <stdio.h>
void mame(int *num1, int *num2) {
  if (*num1 > *num2) {
    int aux = *num1;
    *num1 = *num2;
    *num2 = aux;
  }
}
int soma(int *num1, int *num2) {
  int i, soma = 0;
  for (i = *num1 + 1; i < *num2; i++) {
    if (i % 2 != 0) {
      printf("%d\n", i);
      soma += i;
    }
  }
  return soma;
}
int main() {
  int num1, num2;
  printf("Insira o primeiro numero: ");
  scanf("%d", &num1);

  printf("Insira o segundo numero: ");
  scanf("%d", &num2);

  mame(&num1, &num2);
  printf("A somatoria sera %d.\n", soma(&num1, &num2));
  return 0;
}
