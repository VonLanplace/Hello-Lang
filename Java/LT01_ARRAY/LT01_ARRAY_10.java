/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 10. Criar uma matriz \[8\]\[8\] onde o programa irá carregar segundo:
 * | Casa:  | 1 | 2 | 3 | 4 | ... | Exibir Soma |
 * | Valor: | 1 | 2 | 4 | 8 | ... | dos Valores |
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_10 {
	public static void main(String[] args) {
		String title = "LT01_ARRAY_10";
		int[][] matriz = new int[8][8];
		int soma = 0;
		// Carregar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 2 ^ (i + j);
				soma += 2 ^ (i + j);
			}
		}
		JOptionPane.showMessageDialog(null, "A soma das casas é " + soma, title, 0);
	}
}
