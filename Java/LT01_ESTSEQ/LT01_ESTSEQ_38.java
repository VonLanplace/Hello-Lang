/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Nome do Programador: Lucas Sartorelli
* Data: 22/02/2025
* Descrição:
* Receba 100 números inteiros reais. 
* Verifique e mostre o maior e o menor valor. 
* Obs.: somente valores positivos.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_38 {
    public static void main (String args[]){
        Integer maior, menor, atual,i;
        
        do{
            atual = Integer.parseInt(JOptionPane.showInputDialog("Insira um número Inteiro Positivo"));
            if(atual<0){
                JOptionPane.showMessageDialog(null,"Valor Inválido.");
            }
        }while(atual<0);
        maior = atual;
        menor = atual;
        
        for(i=1;i<100;i++){
            do{
                atual = Integer.parseInt(JOptionPane.showInputDialog("Insira um número Inteiro Positivo"));
                if(atual<0){
                    JOptionPane.showMessageDialog(null,"Valor Inválido.");
                }
            }while(atual<0);
            
            if(atual > maior){
                maior = atual;
            }else if(atual < menor){
                menor = atual;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número foi " +maior +".\nO menor número foi " +menor +".");
    }
}
