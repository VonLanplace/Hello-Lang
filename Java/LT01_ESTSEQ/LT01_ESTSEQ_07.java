/*
 * Nome Do Programador: Lucas Sartorelli
 * Data : 13/02/2025
 * Descrição: Receba os valores do comprimento, largura e altura de um paralelepípedo. 
 * Calcule e mostre seu volume.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_07 {
	public static void main(String args[]) {
		Double comprimento;
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do comprimento: "));
		comprimento *= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da largura: "));
		comprimento *= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura: "));
		JOptionPane.showMessageDialog(null,"O valor do volume é " +comprimento);
	}
}
