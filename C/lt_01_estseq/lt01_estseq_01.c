#include <stdio.h>
int main() {
  int lado;
  printf("Insira o valor do Lado: ");
  scanf("%d", &lado);
  lado = lado * lado;
  printf("A area é %d", lado);
  return 0;
}
