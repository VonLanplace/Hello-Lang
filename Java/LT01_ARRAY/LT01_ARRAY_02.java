/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 2. Criar e coletar um vetor \[100\] inteiro e exibir:
 *	- a. O maior e o menor valor;
 *	- b. A média dos valores.
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_02 {
	public static void main(String[] args) {
		int[] vector = new int[100];
		String title = "LT01_ARRAY_02";
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

		// Maior menor
		int soma = 0, maior = vector[0], menor = vector[0];
		for (int i = 0; i < vector.length; i++) {
			soma += vector[i];
			if (vector[i] > maior) {
				maior = vector[i];
			} else if (vector[i] < menor) {
				menor = vector[i];
			}
		}
		JOptionPane.showMessageDialog(null, "O Maior valor é" + maior + "\nO Menor valor é" + menor, title, 0);
		// Média
		JOptionPane.showMessageDialog(null, "A média dos valores é " + (soma / vector.length), title, 0);

	}
}
