/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba o número de voltas, a extensão do circuito 
 * (em metros) e o tempo de duração (minutos). 
 * Calcule e mostre a velocidade média em km/h.]]
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_27 {
    public static void main(String args[]){
        Double vol, circ, temp;
        circ = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do Circuito."));
        vol = Double.parseDouble(JOptionPane.showInputDialog("Insira o númeor de voltas."));
        temp = Double.parseDouble(JOptionPane.showInputDialog("Insira o Tempo de Duração"));
        vol = (((vol*circ)/temp)*3.6);
        JOptionPane.showMessageDialog(null,"A velocidade média é " +vol +"km/h.");
    }
}
