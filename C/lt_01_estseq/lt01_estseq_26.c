#include <math.h>
#include <stdio.h>
int main() {
  int num1, num2;

  printf("Digite um Numero: ");
  scanf("%d", &num1);

  printf("Digite um Numero: ");
  scanf("%d", &num2);

  if (num1 > num2) {
    float aux;
    aux = num1;
    num1 = num2;
    num2 = aux;
  }

  if (fmodf(num2, num1) == 0) {
    printf("%d e divisivel por %d.\n", num2, num1);
  } else {
    printf("%d nao e divisivel por %d.\n", num2, num1);
  }

  return 0;
}
