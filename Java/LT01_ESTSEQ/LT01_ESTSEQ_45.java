/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Calcule e mostre a Série = 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225.
 * Série = 1/(1^2) – 2/(2^2) .. +N/N^2 -(N+1)/((N+1)^2)
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_45 {
    static Double Fserie (Double N){
        Double serie;
        if(N>1){
            if((N%2)!=0.0){
                serie = (N/(N*N)) + Fserie(N-1);
            }else{
                serie = Fserie(N-1) - (N/(N*N));
            }
        }else{
            serie = (N/(N*N));
        }
        return serie;
    }
    
    public static void main(String args[]){
        Double num,resp;
        //num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor N."));
        num = 15.00;
        resp = Fserie(num);
        JOptionPane.showMessageDialog(null, "O valor da Série é " +resp +".");
    }
}
