/*
 * Nome Do Programador: Lucas Sartorelli
 * Data: 14/02/2025
 * Descrição: Calcule a quantidade de litros gastos em uma viagem, 
 * 			  sabendo que o automóvel faz 12 km/l.
 *  		  Receber o tempo de percurso e a velocidade média.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_17 {
	public static void main (String args[]) {
		Double spaco;
		spaco = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do Percurso: "));//Vira o Tempo
		spaco *= Double.parseDouble(JOptionPane.showInputDialog("Insira a Velocidade Média: "));//Vira o Spaço
		spaco /= 12;//Vira a Quantidade de Litros
		JOptionPane.showMessageDialog(null, "A Quantidade de litros gastos é " +spaco);
	}
}
