#include <stdio.h>

int main() {

  double preco, media;

  printf("Insira o valor do Preço: ");
  scanf("%lf", &preco);

  printf("Insira a Media de vendas: ");
  scanf("%lf", &media);

  if ((media >= 1000) && (preco >= 80)) {
    preco *= 0.95;
  } else if ((media < 500) && (preco < 30)) {
    preco *= 1.1;
  } else if ((1000 > media) && (media >= 500) && (80 > preco) &&
             (preco >= 30)) {
    preco *= 1.15;
  }

  printf("O novo preço e %.2lf.\n", preco);
  return 0;
}
