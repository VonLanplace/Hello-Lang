#include <stdio.h>
int main() {
  int expo, base;
  double resp = 1;

  printf("Insira o valor da Base; ");
  scanf("%d", &base);

  printf("Insira o valor do Expoente; ");
  scanf("%d", &expo);

  if (expo == 0) {
    resp = 1.0;
    printf("A potência será %.lf.\n", resp);
  } else if (expo > 0) {
    while (expo > 0) {
      resp *= base;
      expo--;
    }

    printf("A potência será %.lf.\n", resp);
  } else if (expo < 0) {
    expo *= -1;
    resp = base;
    while (expo > 0) {
      resp *= base;
      expo--;
    }
    resp = 1.0 / resp;
    printf("A potência será %.3lf.\n", resp);
  }
  return 0;
}
