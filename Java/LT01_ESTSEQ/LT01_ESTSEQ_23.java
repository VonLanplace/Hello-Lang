/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 21/02/2025
 * Descrição: 
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
 * Mostre os 4 números em ordem crescente.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_23 {
    static void sorting(Double[] arrumado, Integer f){
        Integer i, k;
        Double aux;
        for(i=0;i<f;i++){
            for(k=(i+1);k<f;k++){
                if(arrumado[i]>arrumado[k]){
                    aux = arrumado[i];
                    arrumado[i]=arrumado[k];
                    arrumado[k]=aux;
                }
            }
        }
    }
    
    public static void main(String args[]){
        Double[] Vet;
        Integer N;
        N=4;
        Vet = new Double[N];
        Vet[0]=Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º Valor"));
        Vet[1]=Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º Valor"));
        Vet[2]=Double.parseDouble(JOptionPane.showInputDialog("Insira o 3º Valor"));
        Vet[3]=Double.parseDouble(JOptionPane.showInputDialog("Insira o 4º Valor"));
        sorting(Vet,N);
        JOptionPane.showMessageDialog(null, Vet);
    }
}