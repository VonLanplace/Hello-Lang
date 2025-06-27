/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Nome do Programador: Lucas Sartorelli
* Data: 22/02/2025
* Descrição:Calcule e mostre a Série = 1 + 2/3 + 3/5 + ... + 50/99.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_42 {
    public static void main(String args[]){
        Double A, B, R;
        B = 1.0;
        R = 0.0;
        for (A=1.0;A<=50;A++){
            R += (A / B);
            B += 2;
        }
        JOptionPane.showMessageDialog(null,"O valor da Série é " +R);
    }
}
