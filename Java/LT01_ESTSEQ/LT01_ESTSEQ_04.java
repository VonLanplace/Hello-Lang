/*
 * Nome do Programador: 
 * Data: 13/02/2025
 * Descrição: Receba a temperatura em graus Celsius. 
 * 			  Calcule e mostre a sua temperatura convertida eme Fahrenheit
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_04 {
	public static void main (String args[]) {
		Double celsius;
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Celsius: "));
        celsius *= 9;
        celsius /= 5;
        celsius += 32;
		JOptionPane.showMessageDialog(null,"O valor em Fahrenheith é " +celsius);
	}
}
