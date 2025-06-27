/*
 * Nome Do Proramador:Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba 2 ângulos de um triângulo. 
 * 			  Calcule e mostre o valor do 3º ângulo.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_14 {
	public static void main (String args[]) {
		Double angulo;
		angulo = 180.00;
		angulo -= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do 1º Ângulo"));
		angulo -= Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do 2º Ângulo"));
		JOptionPane.showMessageDialog(null, "O valor do 3º Ângulo é " +angulo);
	}
}
