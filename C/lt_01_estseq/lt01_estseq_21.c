#include <stdio.h>

int main() {

  float nota, aux;
  int i, j;

  for (i = 0; i < 1; i++) {

    nota = 0;
    for (j = 0; j < 4; j++) {

      printf("Insira o valor da %d nota do aluno %d: ", j + 1, i + 1);
      scanf("%f", &aux);
      nota += aux;
    }

    nota /= j;

    if (nota >= 6) {
      printf("Aluno %d - APROVADO.\n", i + 1);
    } else if (nota >= 3) {
      printf("Aluno %d - EXAME.\n", i + 1);
    } else {
      printf("Aluno %d - RETIDO.\n", i + 1);
    }
  }
  return 0;
}
