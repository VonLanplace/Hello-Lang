/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_34 {
    public static void main(String args[]){
        Integer i;
        Double N;
        Double[] Vet;
        Vet = new Double[10];
        N = Double.parseDouble(JOptionPane.showInputDialog("Insira Um número"));
        for(i=0;i<10;i++){
            Vet[i]=(N*(i+1));
        }
        JOptionPane.showMessageDialog(null, "A Tabuada de " +N +" é:\n01º|" +Vet[0] +"\n02º|" +Vet[1]+"\n03º|" +Vet[2]+"\n04º|" +Vet[3]+"\n05º|" +Vet[4]+"\n06º|" +Vet[5]+"\n07º|" +Vet[6]+"\n08º|" +Vet[7]+"\n09º|" +Vet[8]+"\n10º|" +Vet[9]);
    }
}
