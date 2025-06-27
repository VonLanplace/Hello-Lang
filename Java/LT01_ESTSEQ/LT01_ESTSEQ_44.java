
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba o número da base e do expoente. 
 * Calcule e mostre o valor da potência.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_44 {
    public static void main(String args[]){
        Double base, expo, resu, i;
        resu = 1.0;
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base."));
        expo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Expoente."));
        if(expo>=0){
            for(i=1.0;i<=expo;i++){
                resu *= base;
            }
            JOptionPane.showMessageDialog(null, base +"^" +expo +"=" +resu);
        }else{
            expo *= -1;
            for(i=1.0;i<=expo;i++){
                resu *= (1/base);
            }
            JOptionPane.showMessageDialog(null, base +"^(-" +expo +")=" +resu);
        }
    }
    
}
