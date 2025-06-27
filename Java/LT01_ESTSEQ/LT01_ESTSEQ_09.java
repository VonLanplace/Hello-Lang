/*
 * Nome Do Progamador: Lucas Sartorelli
 * Data: 13q02/2025
 * Descrição: Receba os 2 números inteiros. 
 * Calcule e mostre a soma dos quadrados.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_09 {
	public static void main (String args[]){
		Integer n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 1º número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 2º número; "));
		n1 *= n1;
		n2 *= n2;
		n1 = (n1+n2);
		JOptionPane.showMessageDialog(null,"O valor da soma dos Quadrados é " +n1);
	}
}
