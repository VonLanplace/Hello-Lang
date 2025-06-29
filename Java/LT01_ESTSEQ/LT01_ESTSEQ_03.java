
/*
 * Nome do Programador: 
 * Data: 13/02/2025
 * Descrição: Receba a base e a Altura de um triângulo. Calcule e mostre a sua área.
 */
import javax.swing.JOptionPane;

public class LT01_ESTSEQ_03 {
	public static void main(String args[]) {
		Double altura;
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		altura *= (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dabase: ")) / 2);
		JOptionPane.showMessageDialog(null, "A área é " + altura);
	}
}
