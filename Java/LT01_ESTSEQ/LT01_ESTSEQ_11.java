/*
 * Nome Do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba o raio de uma circunferência. 
 * Calcule e mostre o comprimento da circunferência.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_11 {
	public static void main (String args[]){
		Double raio;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o vaor do raio: "));
		raio *= (2*Math.PI);
		JOptionPane.showMessageDialog(null, "O Valor da Circunferência é " +raio);
	}
}
