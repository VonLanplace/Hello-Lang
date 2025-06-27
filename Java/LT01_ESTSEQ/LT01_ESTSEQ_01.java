/*
 * Nome Do Programador:Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição:
 */

import javax.swing.JOptionPane;

public class LT01_ESTSEQ_01 {
	public static void main (String args[]) {
		Double lado, area;
		lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado: "));//Int.parseInteger()
		area = (lado*lado);
		JOptionPane.showMessageDialog(null,"A área é : " +area);
	}
}
