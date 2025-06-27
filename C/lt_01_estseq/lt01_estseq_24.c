#include <stdio.h>

int main() {

  int num;

  printf("Insira o numero a ser testado: ");
  scanf("%d", &num);

  if (((num % 2) == 0) && ((num % 3) == 0)) {
    printf("%d e divisivel por 2 e 3.\n", num);
  } else {
    printf("%d nao e divisivel por 2 e 3.\n", num);
  }

  return 0;
}
