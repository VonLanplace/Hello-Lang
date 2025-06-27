/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 21/02/2025
 * Descrição: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula $AX²+BX+C=0$. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.]]
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_20 {
    public static void main(String args[]){
        Double axx, bx, c, delta;
        axx = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de axx"));
        bx = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de bx"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de c"));
        delta = (Math.pow(2, bx)-((axx*4)*c));
        bx *= -1;
        if(delta >= 0){
            if(delta == 0){
                c = (bx+(Math.sqrt(delta)))/2;
                JOptionPane.showMessageDialog(null,"O valor da raiz é " +c);
            }else{
                c = (bx+(Math.sqrt(delta)))/2;
                delta = (bx-(Math.sqrt(delta)))/2;
                JOptionPane.showMessageDialog(null,"O valor da raiz x' é " +c +" - O valor da raix x'' é " +delta);                
            }
        }else{
            delta *= -1;
            axx *= 2;
            bx /= axx;
            JOptionPane.showMessageDialog(null,"O valor da raiz x' é " +bx +"+(i√" +delta +")/" +axx +" - O valor da raiz x' é " +bx +"-(i√" +delta +")/" +axx);
        }
    }
}
