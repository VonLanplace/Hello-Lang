/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 9. Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
		| 1  | -  | -- | -- |
		| -  | 4  | -- | -- |
		| -  | -  | 16 | -- |
		| -  | -  | -- | 64 |
 */

public class LT01_ARRAY_09 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		// Carregar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = 2 ^ (i + j);
				} else {
					matriz[i][j] = (int) (Math.random() * 101);
				}
			}
		}
	}
}
