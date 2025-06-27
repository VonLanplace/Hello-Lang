/*
 * Nome Do Programador: Lucas Sartorelli
 * Data; 14/02/2025
 * Descrição: Receba a quantidade de horas trabalhadas, o valor por hora, 
 * 			  o percentual de desconto e o número de descendentes. 
 * 			  - Calcule o salário que serão as horas trabalhadas x o valor por hora. 
 * 			  - Calcule o salário líquido (= Salário Bruto – desconto). 
 * 			  - A cada dependente será acrescido R$ 100 no Salário Líquido. 
 * 			  Exiba o salário a receber.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_16 {
	public static void main (String args[]) {
		Double salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de Horas Trabalhadas: "));// Vira Valor Trabalhado
		salario *= Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor por Hora: "));//Vira Salário Bruto
		salario -= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Desconto: "));//Vira Salário Líquido
		salario += (100*Double.parseDouble(JOptionPane.showInputDialog("Insira o Número de Descendentes: ")));//Vira Salário a receber
		JOptionPane.showMessageDialog(null,"O valor a se recebido é " +salario);
	}
}
