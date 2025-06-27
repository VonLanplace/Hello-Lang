/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 4. Criar e coletar em um vetor \[30\] real e calcular e exibir:
 *	- a. A média do grupo;
 *	- b. A quantidade de notas acima do grupo;
 *	- c. As posições dos valores abaixo da média do grupo.
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_04 {
	public static void main(String[] args) {
		int[] VT1 = new int[30];
		String title = "LT01_ARRAY_04";
		String aux;

		// Carregar
		for (int i = 0; i < VT1.length; i++) {
			aux = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
			try {
				VT1[i] = Integer.parseInt(aux);
			} catch (NumberFormatException e) {
				i--;
			}
		}
		// Media do grupo
		int soma = 0;
		for (int i = 0; i < VT1.length; i++) {
			soma += VT1[i];
		}
		float media = soma / VT1.length;
		JOptionPane.showMessageDialog(null, "A media dos valores é: " + media, title, 0);
		// quantidade de acima da média
		int acima = 0;
		for (int i = 0; i < VT1.length; i++) {
			if (VT1[i] > media) {
				acima++;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de valores acima da média é" + acima, title, 0);
		// posições abaixo da media
		String text = "As posições Abaixo da media são:";
		for (int i = 0; i < VT1.length; i++) {
			if (VT1[i] < media) {
				text += "\n" + i + " com o Valor " + VT1[i];
			}
		}
		JOptionPane.showMessageDialog(null, text, title, 0);
	}
}
