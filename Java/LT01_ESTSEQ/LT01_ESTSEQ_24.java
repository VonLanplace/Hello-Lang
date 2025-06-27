/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba um valor inteiro. 
 * Verifique e mostre se é divisível por 2 e 3.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_24 {
    public static void main(String args[]){
        Integer num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Insira o Número a ser Testado"));
        if(((num%2)==0)&&((num%3)==0)){
            JOptionPane.showMessageDialog(null, num +" é divisivel por 2 e 3.");
        }else{
            JOptionPane.showMessageDialog(null, num +" não é divisivel por 2 e 3.");
        }
    }
}
