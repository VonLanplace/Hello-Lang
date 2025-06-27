/*
 * Nome do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba 2 números reais. 
 * 			  Calcule e mostre a diferença desses valores.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_10 {
	public static void main (String args[]) {
		Double n1, n2, diferença;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º Valor"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º Valor"));
		diferença = Math.sqrt(Math.pow((n1-n2),2));
		JOptionPane.showMessageDialog(null, "O valor da Diferença é " +diferença);
	}
}
