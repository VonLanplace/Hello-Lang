#include <math.h>
#include <stdio.h>
int main() {

  double axx, bx, c, delta, raiz;
  printf("Insita o valor de axx: ");
  scanf("%lf", &axx);
  printf("Insira o valor de bx: ");
  scanf("%lf", &bx);
  printf("Insira o valor de c: ");
  scanf("%lf", &c);
  delta = (bx * bx) - (4 * axx * c);

  if (delta >= 0) {
    raiz = sqrt(delta);
    c = (bx + raiz) / (2 * axx);
    delta = (bx - raiz) / (2 * axx);
    printf("O valor de X' e %.2lf\n", c);
    printf("O valor de x'' e %.2lf\n", delta);
  } else {
    printf("Valor inválido.\n");
  }
  return 0;
}
