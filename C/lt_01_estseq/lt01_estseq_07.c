#include <stdio.h>
// Lucas Sartorelli
// Calculating Volume of a paralelepiped

int main() {

  float com, alt, lar;
  printf("Insira o Valor da Altura: ");
  scanf("%f", &alt);

  printf("Insira o Valor do Comprimento: ");
  scanf("%f", &com);

  printf("Insira o Valor da Largura: ");
  scanf("%f", &lar);

  printf("O valor do Volume será %.2f.", (alt * com * lar));

  return 0;
}
