#include <stdio.h>

int main() {

  double spaco, temp;

  printf("Insira a quantidade de voltas: ");
  scanf("%lf", &spaco);

  printf("Insira a extensão do percurso: ");
  scanf("%lf", &temp);

  spaco = (spaco * temp) / 1000;

  printf("Insira o valhor do tempo: ");
  scanf("%lf", &temp);

  temp /= 60;

  spaco = (spaco / temp);

  printf("A velocidade media foi %.2lf Km/h.\n", spaco);
  return 0;
}
