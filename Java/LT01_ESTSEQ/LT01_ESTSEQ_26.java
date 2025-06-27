/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba 2 números inteiros. 
 * Verifique e mostre se o maior número é múltiplo do menor.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_26 {
    public static void main(String args[]){
        Double num1, num2, aux;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º Valor"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º Valor"));
        if(num1<num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if((num1 % num2)==0){
            JOptionPane.showMessageDialog(null,num1 +" é multiplo de " +num2 +".");
        }else{
            JOptionPane.showMessageDialog(null,num1 +" não é multiplo de " +num2 +".");
        }
    }
}
