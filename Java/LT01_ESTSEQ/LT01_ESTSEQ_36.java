/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba um número N. 
 * Calcule e mostre a Série = 1 + 1/1! + 1/2! + ... + 1/N!.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_36 {
    static Double Ffatorial(Integer val){
        Double fatorial;
        Integer i;
        fatorial = 1.0;
        for(i=1;i<=val;i++){
            fatorial *= i;
        }
        //JOptionPane.showMessageDialog(null,fatorial);
        return fatorial;
    }
    
    static Double FSerie1(Integer num){
        Integer i;
        Double resposta;
        resposta = 0.0;
        for(i=1;i<=num;i++){
            resposta += (1/Ffatorial(i));
            //JOptionPane.showMessageDialog(null,resposta);
        }
        return resposta;
    };
    
    public static void main (String args[]){
        Integer N;
        Double resp;
        N = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número N."));
        resp = FSerie1(N);
        JOptionPane.showMessageDialog(null,"O valor da Série é " +resp +".");
    }
}
