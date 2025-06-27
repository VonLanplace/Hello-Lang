/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Calcule e mostre quantos anos serão necessários para que Ana 
 * seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm 
 * ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_43 {
    public static void main(String args[]){
        Double Ha, Hm;
        Integer An;
        
        Hm = (1.50*100);
        Ha = (1.10*100);
        for (An = 1; Ha<Hm ;An++){
            Hm += 1.5;
            Ha += 3;
        }
        JOptionPane.showMessageDialog(null,"Serão necessários " +An +" Anos.");
    }
}
