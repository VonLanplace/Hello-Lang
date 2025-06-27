/*
 * Nome Do Programador: Lucas Sartorelli
 * Data: 14/02/2025
 * Desrição: Receba os valores de 2 catetos de um triângulo retângulo. 
 * 			 Calcule e mostre a hipotenusa.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_15 {
	public static void main (String args[]) {
		Double hipotenusa;
		hipotenusa = Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Cateto Adjacente")),2);
		hipotenusa += Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Cateto Oposto")), 2);
		hipotenusa = Math.sqrt(hipotenusa);
		JOptionPane.showMessageDialog(null, "O Valor da Hipotenusa é " +hipotenusa);
	}
}
