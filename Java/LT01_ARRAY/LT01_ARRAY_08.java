/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 8. Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
 *  - a. A quantidade de cada produto vendido no mês;
 *  - b. A quantidade de produtos vendidos por semana;
 *  - c. O total de produtos vendidos no mês.
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_08 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][3];
		String title = "LT01_ARRAY_08";
		String temp;

		// Carregar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				temp = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
				try {
					matriz[i][j] = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					i--;
				}
			}
		}
		// A quantidade de cada produto vendido no mês; Coluna
		int soma;
		for (int j = 0; j < matriz[0].length; j++) {
			soma = 0;
			for (int i = 0; i < matriz.length; i++) {
				soma += matriz[i][j];
			}
			JOptionPane.showMessageDialog(null, "Foram vendidas " + soma + " unidades do produto " + (j + 1), title, 0);
		}
		// A quantidade de produtos vendidos por semana; Linha
		for (int i = 0; i < matriz.length; i++) {
			soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
			JOptionPane.showMessageDialog(null, "Foram vendidos " + soma + " produtos na semana " + (i + 1), title, 0);
		}
		// O total de produtos vendidos no mês. Total
		soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, "O total de vendidos é " + soma, title, 0);

	}
}
