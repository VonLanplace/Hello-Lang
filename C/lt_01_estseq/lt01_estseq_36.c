#include <stdio.h>

int fat(int *num) {
  int fat = *num, i;
  for (i = *num - 1; i > 0; i--) {
    fat *= i;
  }
  return fat;
}

double serie(int *num) {
  double serie = 0;
  int i;

  for (i = 1; i <= *num; i++) {
    serie += 1.0 / fat(&i);
  }
  return serie;
}

int main() {
  int num;

  printf("Insira um numeor a ser calculada a serie: ");
  scanf("%d", &num);

  printf("O valor da serie será %.2lf.\n", serie(&num));
  return 0;
}
