/*
 * Descrição:
 * 1. Criar e coletar um vetor \[50\] inteiro. Calcular e exibir:
 *	- a. A média dos valores entre 10 e 200;
 *	- b. A soma dos números ímpares.
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_01 {
	public static void main(String[] args) {
		int[] vector = new int[50];
		String title = "LT01_ARRAY_01";
		String aux;

		// Carregar
		for (int i = 0; i < vector.length; i++) {
			aux = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
			try {
				vector[i] = Integer.parseInt(aux);
			} catch (NumberFormatException e) {
				i--;
			}
		}

		// Média dos valores entre 10 < x < 200
		int soma = 0, j = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > 10 && vector[i] < 200) {
				soma += vector[i];
				j++;
			}
		}
		JOptionPane.showMessageDialog(null, "A média dos valores entre 10 e 200 é:" + (soma / j), title, 0);

		// Soma dos numeros Inpares
		soma = j = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 1 == 0) {
				soma += vector[i];
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos números Inpares é:" + soma, title, 0);
	}
}
