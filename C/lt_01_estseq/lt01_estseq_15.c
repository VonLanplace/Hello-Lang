// Nome do Programador:
// Descrição:

#include <math.h>
#include <stdio.h>

int main() {

  float adj, opo, hip;

  printf("Insira o valor do Cateto Adjaente: ");
  scanf("%f", &adj);

  printf("Insira o valor do Cateto Oposto: ");
  scanf("%f", &opo);

  opo = pow(opo, 2);
  adj = pow(adj, 2);
  hip = opo + adj;
  hip = sqrtf(hip);

  printf("O valor da Hipotenusa e %.2f.\n", hip);
  return 0;
}
