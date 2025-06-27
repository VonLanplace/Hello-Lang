/*
 * Nome do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição:Receba o valor de um depósito em poupança. 
 * Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
import javax.swing.JOptionPane;
public class LT01_EsTSEQ_08 {
	public static void main (String args[]){
		Double valor;
		valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor a ser Calculado: "));
		valor *= 1.013;
		JOptionPane.showMessageDialog(null, "O valor após 1 mês será " +valor);
	}
}
