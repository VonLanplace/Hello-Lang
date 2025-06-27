// Nome do Programador:
// Descrição:

#include <stdio.h>

int main() {

  int atual, nascimento;
  do {

    printf("Insira o ano do nacimento: ");
    scanf("%i", &nascimento);
    if (nascimento < 0) {
      printf("Data Inválida!\n");
    }

  } while (nascimento < 0);
  do {

    printf("Insira o ano atual: ");
    scanf("%i", &atual);
    if (atual < nascimento) {
      printf("Data Inválida!\n");
    }

  } while (atual < nascimento);

  printf("\nA idade e %i.\nDaqui a 17 anos tera %i de idade.\n",
         (atual - nascimento), ((atual - nascimento) + 17));
  return 0;
}
