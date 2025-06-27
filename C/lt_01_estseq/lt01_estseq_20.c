#include <math.h>
#include <stdio.h>

float entradaf(char text[]) {

  float num;

  printf("%s", text);
  scanf("%f", &num);

  return num;
}

void deltaNeg(float axx, float bx, float c) {
  float delta = (-1) * (pow(bx, 2) - (4 * axx * c));
  bx *= -1;
  axx *= 2;
  printf("O valor de x e %.2f/%.2f + i*sqrt(%.2f)/%.2f.\n", bx, axx, delta,
         axx);
  printf("O valor de x' e %.2f/%.2f - i*sqrt(%.2f)/%.2f.\n", bx, axx, delta,
         axx);
}

void delta0(float axx, float bx, float c) {
  bx *= -1;

  printf("O valor da raiz e %.2f.\n",
         (bx + sqrt(pow(bx, 2) - (4 * axx * c))) / (2 * axx));
}

void deltaPos(float axx, float bx, float c) {
  bx *= -1;

  printf("O valor da x e %.2f.\n",
         (bx + sqrt(pow(bx, 2) - (4 * axx * c))) / (2 * axx));

  printf("O valor de x' e %.2f.\n",
         (bx - sqrt(pow(bx, 2) - (4 * axx * c))) / (2 * axx));
}

int main() {

  float axx = entradaf("Insira o valor de axx: "),
        bx = entradaf("Insira o valor de bx: "),
        c = entradaf("Insira o valor de c: ");

  if (pow(bx, 2) - (4 * axx * c) > 0) {
    deltaPos(axx, bx, c);
  } else if (pow(bx, 2) - (4 * axx * c) == 0) {
    delta0(axx, bx, c);
  } else {
    deltaNeg(axx, bx, c);
  }

  return 0;
}
