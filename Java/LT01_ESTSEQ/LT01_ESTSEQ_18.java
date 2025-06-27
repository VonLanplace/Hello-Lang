/*
* Nome do Programador: Lucas Sartorelli
* Data: 21/02/2025
* Descrição: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
*/

import javax.swing.JOptionPane;

public class LT01_ESTSEQ_18 {
    public static void main (String args[]){
        Integer a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º Número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º Número"));

        if(a>b){
            a -= b;
            JOptionPane.showMessageDialog(null, "A diferença é " +a);
        }else{
            b -= a;
            JOptionPane.showMessageDialog(null, "A diferença é " +b);
        }
    }
}
