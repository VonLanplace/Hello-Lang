#include <stdio.h>

int main() {

  float temp;
  printf("\nInsira o  valor em Celsius: ");
  scanf("%f", &temp);
  temp *= 9;
  temp += 160;
  temp /= 5;
  printf("O valor da temperatura em Fahrenheigth e %.2f\n", temp);
}
