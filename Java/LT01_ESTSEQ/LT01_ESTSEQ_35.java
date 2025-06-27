/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_35 {
    public static void main(String args[]){
        Integer num1, num2, aux;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número Inteiro."));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número Inteiro."));
        aux = 0;
        
        //Arrumando o Maior
        if(num2>num1){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        //Somatória
        aux = somaodd(num1-1,num2);
        JOptionPane.showMessageDialog(null,"O resultado da somatória é " +aux +".");
    }
    
    static Integer somaodd(Integer maior, Integer menor){
        Integer soma;
        if(maior>menor){
            if((maior%2)==1){
                soma = maior + somaodd(maior-1,menor);
                return soma;
            }else{
                soma = somaodd(maior-1,menor);
                return soma;
            }
        }else{
            return 0;
        }
    };
}
