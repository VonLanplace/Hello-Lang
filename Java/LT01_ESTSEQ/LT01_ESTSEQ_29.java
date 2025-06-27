/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
 * Demais tipos não serão considerados.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_29 {
    public static void main(String args[]){
        Integer tipo;
        Double valor;
        do{
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento:\n1. Poupança\n2. Renda Fixa\n9. Cancelar"));
            switch(tipo){
                case 1:
                    tipo = 9;
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
                    valor *= 1.03;
                    JOptionPane.showMessageDialog(null, "O valor corrigido é " +valor +".");
                    break;
                case 2:
                    tipo = 9;
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
                    valor *= 1.05;
                    JOptionPane.showMessageDialog(null, "O valor corrigido é " +valor +".");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Cancelado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Tipo Inválido");
                    break;
            }
        }while(tipo != 9);
    }
}
