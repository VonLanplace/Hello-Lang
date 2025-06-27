/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_32 {
    public static void main (String args[]){
        Integer fatorial, i;
        do{
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor a ser Fatorado."));
        if(fatorial < 2){
            JOptionPane.showMessageDialog(null,"Valor Inválido.");
        }
        }while(fatorial < 2);
        for(i = (fatorial-1); i > 1; i--){
           fatorial *= i;
        }
        JOptionPane.showMessageDialog(null, "O Valor será "  +fatorial +".");
    }
}
