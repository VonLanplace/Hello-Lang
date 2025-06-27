/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 *11. Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
		|  1  |  1  |  1  |  1  |  1  |  1  |  1  |  1  |
		|  1  |  2  |  2  |  2  |  2  |  2  |  2  |  1  |
		|  1  |  2  |  3  |  3  |  3  |  3  |  2  |  1  |
		|  1  |  2  |  3  |  4  |  4  |  3  |  2  |  1  |
		|  1  |  2  |  3  |  4  |  4  |  3  |  2  |  1  |
		|  1  |  2  |  3  |  3  |  3  |  3  |  2  |  1  |
		|  1  |  2  |  2  |  2  |  2  |  2  |  2  |  1  |
		|  1  |  1  |  1  |  1  |  1  |  1  |  1  |  1  |
 */

public class LT01_ARRAY_11 {
	public static void main(String[] args) {
		int[][] matriz = new int[8][8];
		// Carregar
		for (int i = 0; i < matriz.length / 2; i++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < matriz[j].length; k++) {
					if (i == 0) {
						matriz[j][k] = 1;
					} else {
						matriz[k][j]++;
					}
				}
			}
		}
	}
}
