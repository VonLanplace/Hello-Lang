// Nome do Programador:
// Desrição:

#include <stdio.h>

int main() {

  float alpha, beta, gamma;

  do {
    alpha = 180;
    do {

      printf("Insira o valor do 1 angulo: ");
      scanf("%f", &beta);

      if (beta < 0) {

        printf("Valor Inválido.\n");
      }
    } while (beta < 0);
    do {

      printf("Insira o valor do 2 angulo: ");
      scanf("%f", &gamma);

      if (gamma < 0) {

        printf("Valor Inválido.\n");
      }
    } while (gamma < 0);

    alpha = alpha - beta - gamma;

    if ((alpha <= 0) || (alpha >= 180)) {
      printf("Isso nao e um triangulo!\n");
    }

  } while ((alpha <= 0) || (alpha >= 180));

  printf("O valor do angulo sera %.0f°.\n", alpha);
  return 0;
}
