/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 5. Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
		 10
		 ∑ (A[1] – A[21–1])
		 i = 1
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_05 {
	public static void main(String[] args) {
		int[] vetor = new int[20];
		String title = "LT01_ARRAY_05";
		String aux;

		// Carregar
		for (int i = 0; i < vetor.length; i++) {
			aux = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
			try {
				vetor[i] = Integer.parseInt(aux);
			} catch (NumberFormatException e) {
				i--;
			}
		}
		// Calc
		String text = "Os Valores São:\n|";
		for (int i = 0; i < vetor.length; i++) {
			text += (vetor[i] - vetor[vetor.length - i]) + "|";
		}
		JOptionPane.showMessageDialog(null, text, title, 0);
	}
}
