/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 2. Criar e coletar um vetor \[100\] inteiro e exibir:
 *	- a. O maior e o menor valor;
 *	- b. A média dos valores.
 * 3. Criar e coletar valores inteiros nos vetores VT1\[3\] e VT2\[3\].
 *	- Concatenar esses valores em um 3º vetor (VT3\[6\]) e mostrar os seus dados. P. ex:
 *	| VT1 | 1   | 2   | 3   | -   | -   | -   |
 *	| VT2 | 4   | 5   | 6   | -   | -   | -   |
 *	| VT3 | 1   | 2   | 3   | 4   | 5   | 6   |
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_03 {
	public static void main(String[] args) {
		int[] VT1 = new int[3];
		String title = "LT01_ARRAY_03";
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
		// Vector 2
		int[] VT2 = new int[3];
		// Carregar
		for (int i = 0; i < VT2.length; i++) {
			aux = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
			try {
				VT2[i] = Integer.parseInt(aux);
			} catch (NumberFormatException e) {
				i--;
			}
		}

		// Vector 3
		int[] VT3 = new int[VT2.length + VT1.length];
		for (int i = 0; i < VT3.length; i++) {
			if (i < VT1.length) {
				VT3[i] = VT1[i];
			} else {
				VT3[i] = VT2[i - VT2.length];
			}
		}
	}
}
