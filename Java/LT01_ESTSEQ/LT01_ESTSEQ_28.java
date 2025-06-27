/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba o preço atual e a média mensal de um produto. 
 * Calcule e mostre o novo preço sabendo que:
 * 
 * | Venda Mensal      | Preço Atual  | Preço Novo |
 * | ----------------- | ------------ | ---------- |
 * | < 500             | < 30         | + 10%      |
 * | >= 500 e < 1000   | >= 30 e < 80 | + 15%      |
 * | >= 1000           | >= 80        | - 5%       |
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_28 {
    public static void main(String args[]){
        Double Vm, Pa;
        Vm = Double.parseDouble(JOptionPane.showInputDialog("Insira o numero de vendas Mensais."));
        Pa = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço Atual."));
        
        if ((Vm >= 1000) && (Pa >= 80)){
            Pa *= 0.95;
        }else{
            if((Vm<500) && (Pa<30)){
                Pa *= 1.1;
            }else{
                if(((Vm >= 500) && (Vm < 1000)) && ((Pa >= 30) && (Pa < 80))){
                Pa *= 1.15;                   
                }
            }
        }
        JOptionPane.showMessageDialog(null,"O novo preço é " +Pa +".");
    }
}
