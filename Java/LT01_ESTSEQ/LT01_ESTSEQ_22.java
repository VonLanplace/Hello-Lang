/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 21/02/2025
 * Descrição: 
 * Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_22 {
    public static void main (String args[]){
        Integer val1, val2;
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "));
        if(val1 >= val2){
            JOptionPane.showMessageDialog(null, "Em ordem cresente são " +val2 +"," +val1);
        }else{
            JOptionPane.showMessageDialog(null, "Em ordem cresente são " +val1 +"," +val2);
        }
    }
}
