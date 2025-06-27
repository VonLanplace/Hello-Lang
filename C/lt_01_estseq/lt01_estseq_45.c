#include <stdio.h>

int main() {
  double serie = 0.0, k = 0;
  int i;
  for (i = 1; i <= 15; i++) {
    k++;
    if (i % 2 == 0) {
      serie -= k / (k * k);
    } else if (i % 2 != 0) {
      serie += k / (k * k);
    }
  }
  printf("A serie sera %.3lf.\n", serie);
  return 0;
}
