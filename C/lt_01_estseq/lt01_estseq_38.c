#include <stdio.h>
int entrada(char *text) {
  int in;
  printf("%s", text);
  scanf("%d", &in);
  return in;
}
int main() {
  int maior, menor, aux, i;

  for (i = 0; i < 10; i++) {
    aux = entrada("Insira um numero: ");
    if (i == 0) {
      maior = aux;
      menor = aux;
    } else {
      if (maior < aux) {
        maior = aux;
      } else if (menor > aux) {
        menor = aux;
      }
    }
  }

  printf("\nO maior valor e %d.\nO menor valor e %d.\n", maior, menor);
  return 0;
}
