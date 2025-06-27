/*
 * Nome do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba o salário de um funcionário e mostre o novo salário cm reajuste de 15%.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_02 {
	public static void main(String args[]){
		Double salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "))*1.15;
		JOptionPane.showMessageDialog(null,"O novo salário é " +salario);
	}
}
