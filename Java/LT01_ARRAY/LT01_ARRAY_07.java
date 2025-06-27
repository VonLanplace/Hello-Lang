/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 * 7. A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
 */

import javax.swing.JOptionPane;

public class LT01_ARRAY_07 {
	public static void main(String[] args) {
		int[] vetor = new int[20];
		int aux;
		String title = "LT01_ARRAY_07";
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
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		// inicio LT01_ARRAY_07
		// Input
		while (true) {
			temp = JOptionPane.showInputDialog(null, "Insira o valor!", title, 0);
			try {
				aux = Integer.parseInt(temp);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor Inválido!", title, 0);
			}
		}
		//
		if (teste(vetor, 0, vetor.length, aux)) {
			JOptionPane.showMessageDialog(null, "Valor Encontrado.", title, 0);
		} else {
			JOptionPane.showMessageDialog(null, "Valor Não Encontrado.", title, 0);
		}
	}

	public static boolean teste(int[] vetor, int min, int max, int num) {
		if (max > min) {
			int mid = ((max - min) / 2) + min;
			if (vetor[mid] == num) {
				return true;
			} else if (vetor[mid] > num) {
				return teste(vetor, min, mid, num);
			} else {
				return teste(vetor, mid, max, num);
			}
		} else {
			return false;
		}
	}
}
