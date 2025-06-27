// Nome do Progrmador:
// Descrição:

#include <math.h>
#include <stdio.h>

int main() {

  double raio, area;

  printf("Insira o valor do Raio: \n");
  scanf("%lf", &raio);

  area = raio * M_PI * M_PI;
  raio = raio * 2 * M_PI;

  printf("O perimetro do cirulo será %.2lf.\nE a area será %.2lf.\n", raio,
         area);
  return 0;
}
