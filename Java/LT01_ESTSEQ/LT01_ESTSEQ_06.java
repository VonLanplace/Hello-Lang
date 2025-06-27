/*
 * Nome do Programador: Lucas Satorelli
 * Data: 13/02/2025
 * Descrição:Receba os valores em x e y. 
 * Efetua a troca de seus valores e mostre seus conteúdos.
 */
import javax.swing.JOptionPane;

public class LT01_ESTSEQ_06 {
	public static void main (String args[]) {
		double x, y, z;
		x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de y: "));
		z = (x*y);
		y = (z/y);
		x = (z/x);
		JOptionPane.showMessageDialog(null, "O valor de x agora é " +x +" e o valor de y é " +y);
	}
}
