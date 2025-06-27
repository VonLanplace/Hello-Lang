/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Nome do Programador: Lucas Sartorelli
* Data: 22/02/2025
* Descrição:
* Mostre todas as possibilidades de 2 dados de 
* forma que a soma tenha como resultado 7.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_41 {
    public static void main(String args[]){
        Integer d1, d2; 
        for(d1=1;d1<7;d1++){
            for(d2=1;d2<7;d2++){
                if((d1+d2)==7){
                    JOptionPane.showMessageDialog(null,"d1 = " +d1 +"\n"
                            + "d2 = " +d2 +"\n d1+d2 = 7.");
                }
            }
        }
    }
}
