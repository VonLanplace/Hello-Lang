/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 6. Criar e coletar em um vetor [20] com números aleatórios.
 *  - Classificar este vetor em ordem crescente e mostre os dados.
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_06 {
	public static void main(String[] args) {
		int[] vetor = new int[20];
		String title = "LT01_ARRAY_06";
		String temp;

		// Carregar
		for (int i = 0; i < vetor.length; i++) {
			temp = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
			try {
				vetor[i] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				i--;
			}
		}
		// Sart
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
}
