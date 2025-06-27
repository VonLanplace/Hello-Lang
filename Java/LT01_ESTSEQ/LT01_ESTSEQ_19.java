
/**
 * Nome Do Programador: Lucas Sartorelli
 * Data: 21/02/2025
 * Descrição: Receba 2 valores reais. Calcule e mostre o maior deles.
 */
import javax.swing.JOptionPane;

public class LT01_ESTSEQ_19 {
    public static void main(String args[]){
        
        Double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
        
        if(num1>num2){
            JOptionPane.showMessageDialog(null,"O Maior Valor é " +num1);
        }else{
            JOptionPane.showMessageDialog(null,"O Maior Valor é " +num2);
        }
    }
}