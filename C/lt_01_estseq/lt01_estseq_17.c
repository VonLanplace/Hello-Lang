#include <math.h>
#include <stdio.h>

float spacof(float espaco0, float tempo, float velocidade, float aceleracao) {
  float espaco;
  espaco = espaco0 + (velocidade * tempo) + ((aceleracao * pow(tempo, 2)) / 2);
  return espaco;
}

int main() {

  float tempo, velocidade;

  printf("Insira o tempo de Viagem: ");
  scanf("%f", &tempo);

  printf("Insira a Velocidade Media: ");
  scanf("%f", &velocidade);

  printf("A quantdade de litros gastos foi %.2f Litros.\n",
         (spacof(0, tempo, velocidade, 0) / 12));
  return 0;
}
