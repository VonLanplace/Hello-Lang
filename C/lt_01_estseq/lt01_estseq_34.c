#include <stdio.h>

int main() {
  int num;
  printf("Insira o Numero: ");
  scanf("%d", &num);
  for (int i = 1; i <= 10; i++) {
    printf("\n%.2dx%d=%d", i, num, i * num);
  }
  printf("\nEssa e a tabuada de %d.\n", num);
  return 0;
}
