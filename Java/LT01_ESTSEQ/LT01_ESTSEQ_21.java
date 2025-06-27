/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 21/02/2025
 * Descrição: 
 * Receba 4 notas bimestrais de um aluno. 
 * Calcule e mostre a média aritmética. 
 * Mostre a mensagem de acordo com a média:
 * 
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”
 * c. Se a média for < 3,0 exibir “RETIDO”
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_21 {
    public static void main(String args[]){
        Double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1"));
        nota += Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2"));
        nota += Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 3"));
        nota += Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 4"));
        nota /= 4;
        if(nota >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO - Nota: " +nota); 
        }else{
            if(nota >= 3){
                JOptionPane.showMessageDialog(null,"EXAME - Nota: " +nota);
            }else{
                JOptionPane.showMessageDialog(null,"RETIDO - Nota: " +nota);
            }
        }
    }
}
