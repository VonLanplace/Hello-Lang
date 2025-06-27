#include <stdio.h>
void rec(int *num, int *fat) {
  if (*num >= 1) {
    *fat = *num * *fat;
    *num -= 1;
    rec(num, fat);
  }
}

int fat(int num) {
  int fat = num;
  num -= 1;
  rec(&num, &fat);
  return fat;
}

int main() {
  int num;
  printf("Insira o valor a ser Fatorado: ");
  scanf("%d", &num);
  num = fat(num);
  printf("O valor Fatorado e %d.\n", num);
  return 0;
}
