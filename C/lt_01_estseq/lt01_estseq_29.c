#include <stdbool.h>
#include <stdio.h>

int main() {
  int opc;
  double inv, resp;
  bool loop = true;
  do {

    printf("Qual o tipo de investimento?\n1.Poupança-2.Renda Fixa: ");
    scanf("%d", &opc);

    switch (opc) {
    case 1:
      inv = 1.03;
      loop = false;
      break;
    case 2:
      inv = 1.05;
      loop = false;
      break;
    default:
      loop = true;
      break;
    }

  } while (loop == true);

  printf("Insira o valor do Investimento: ");
  scanf("%lf", &resp);

  inv *= resp;

  printf("Apos 30 dias os %.2lfR$ serao %.2lfR$.\n", resp, inv);
  return 0;
}
