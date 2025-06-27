#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  srand(time(NULL));
  int i, size = 3;
  int vet1[size], vet2[size], vet3[size + size];

  printf("\n[");
  for (i = 0; i < size; i++) {
    vet1[i] = rand() % 100;
    printf("|%d", vet1[i]);
  }
  printf("|]\n[");

  for (i = 0; i < size; i++) {
    vet2[i] = rand() % 100;
    printf("|%d", vet2[i]);
  }
  printf("|]\n[");

  for (i = 0; i < (size + size); i++) {
    if (i < size) {
      vet3[i] = vet1[i];
    } else {
      vet3[i] = vet2[i - size];
    }
    printf("|%d", vet3[i]);
  }

  printf("|]\n");
  return 0;
}
