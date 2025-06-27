/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Calcule e mostre o quadrado dos números entre 10 e 150.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_31 {
    public static void main(String args[]){
        Integer i, resposta;
        for(i=11;i<150;i++){
            resposta = (i*i);
            JOptionPane.showMessageDialog(null, "O quadrado de " +i +" é " +resposta +".");
        }
    }
}
