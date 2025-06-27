#include <stdio.h>

int main() {
  int horaI, horaF, minI, minF;
  do {
    printf("Insira a Hora de inicio em (HH:MM): ");
    scanf("%d:%d", &horaI, &minI);
  } while ((horaI < 0) || (horaI >= 24) || (minI < 0) || (minI >= 60));

  do {
    printf("Insira a Hora do final em (HH:MM): ");
    scanf("%d:%d", &horaF, &minF);
  } while ((horaF < 0) || (horaF >= 24) || (minF < 0) || (minF >= 60));

  horaI *= 60;
  horaF *= 60;

  minI = minI + horaI;
  minF = minF + horaF;
  printf("\n%d -- %d\n", minI, minF);

  if (minF < minI) {
    minF = minF - minI + (60 * 24);
  } else {
    minF = minF - minI;
  }

  horaF = minF / 60;
  minF = minF % 60;

  printf("O tempo de jogo foi de %.2d:%.2d.\n", horaF, minF);
  return 0;
}
