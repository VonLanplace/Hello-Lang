#include <stdio.h>

void fibbo(int *num1, int *num2, int *num) {
  if (*num > 0) {
    *num1 += *num2;
    *num -= 1;
    printf("%d\n", *num);
    fibbo(num2, num1, num);
  }
}

int fibboStr(int num) {
  int num1 = 0, num2 = 1;
  if (num > 2) {
    num--;
    fibbo(&num1, &num2, &num);
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  } else if (num <= 2) {
    return num2;
  } else {
    return 0;
  }
}

int main() {
  int num;

  printf("Insira o nesimo termo: ");
  scanf("%d", &num);

  printf("O %d° termo da Serie de Fibonnaci e %d.\n", num, fibboStr(num));
  return 0;
}
