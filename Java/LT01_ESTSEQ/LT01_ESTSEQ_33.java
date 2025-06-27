/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba um número. 
 * Calcule e mostre a Série = 1 + 1/2 + 1/3 + ... + 1/N.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_33 {
    public static void main (String args[]){
        Integer valor;
        Double solucao;
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro maior que 0."));
            if(valor<=0){
                JOptionPane.showMessageDialog(null,"Valor Inválido.");
            }
        }while(valor<=0);
        solucao = FSerie1(valor);
        JOptionPane.showMessageDialog(null,"O valor da Série é " +solucao +".");
    }
    
    static Double FSerie1(Integer num){
        Integer i;
        Double resposta;
        resposta = 0.0;
        for(i=1;i<=num;i++){
            resposta += (1/i.doubleValue());
        }
        return resposta;
    }
}
