/*
 * Nome Do Programador: Lucas Sartorelli
 * Data: 13/02/2025
 * Descrição: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
 * Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 */
import javax.swing.JOptionPane;
/*import Math;
*/
public class LT01_ESTSEQ_05 {
	public static void main (String args[]) {
		Double axx, bx, c, delta;
		axx = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de ax²: "));
		bx = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de bx: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de c"));
		delta = ((bx*bx)-(4*(axx*c)));
        if (delta>=0){
            if(delta>0){
                bx *= -1;
    	    	c = ((bx+(Math.sqrt(delta)))/(2*axx));
	        	delta = ((bx-(Math.sqrt(delta)))/(2*axx));
    		    JOptionPane.showMessageDialog(null,"O valor de x' é " +c +"O valor de x'' é " +delta);
            }
            else{
                bx *= -1;
    	    	c = ((bx+(Math.sqrt(delta)))/(2*axx));
    		    JOptionPane.showMessageDialog(null,"O valor da raiz é " +c +".");
            }
	    }
        else{
            delta *= -1;
            bx *= -1;
    		c = ((bx+(Math.sqrt(delta)))/(2*axx));
	    	delta = ((bx-(Math.sqrt(delta)))/(2*axx));
		    JOptionPane.showMessageDialog(null,"O valor de x' é i+" +c +" - O valor de x'' é i" +delta +".");           
        }
    }
}
