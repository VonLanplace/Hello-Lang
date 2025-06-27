/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Nome do Programador: Lucas Sartorelli
* Data: 22/02/2025
* Descrição:
* Receba um número inteiro. 
* Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_37 {
    public static void main(String args[]){
        Integer resposta, N;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Insira o número N."));
        switch(N){
            case 1:
                resposta = 0;
                break;
            case 2:
                resposta = 1;
                break;
            default:
                resposta = Ffibonacci(N);
                break;
        }
        JOptionPane.showMessageDialog(null,"O " +N +"º termo da série de Fibonacci é " +resposta +".");
    }
    
    static Integer Ffibonacci(Integer valor){
        Integer num1, num2, aux, i;
        num1 = 0;
        num2 = 1;
        aux = 0;
        for(i=3;i<=valor;i++){
            aux = num1+num2;
            num1 = num2;
            num2 = aux;
        }
        return aux;
    }
}
