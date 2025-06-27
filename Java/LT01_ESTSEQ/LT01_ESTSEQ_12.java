/*
 * Nome Do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba o ano de nascimento e o ano atual. 
 * Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_12 {
	public static void main (String args[]) {
		Integer aatual, anasc;
		aatual = Integer.parseInt(JOptionPane.showInputDialog("Insira o Ano Atual: ")) + 17;
		anasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o Ano de Nascimento: "));
		aatual -= anasc;
		JOptionPane.showMessageDialog(null, "A Idade será " +aatual);
	}
}
