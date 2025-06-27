/*
 * Nome Do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba a quantidade de alimento em quilos. 
 * Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_13 {
	public static void main (String args[]) {
		Double kilos;
		kilos = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de Comida em Kg: "));
		kilos /= 0.05;
		JOptionPane.showMessageDialog(null, "Este alimento durará " +kilos +" dias.");
	}
}
