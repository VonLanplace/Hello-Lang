/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Nome do Programador: Lucas Sartorelli
* Data: 22/02/2025
* Descrição:
* Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
* | Casa:   | 1   | 2   | 3   | 4   | ... | 64  |
* | ------- | --- | --- | --- | --- | --- | --- |
* | Qdte:   | 1   | 2   | 4   | 8   | ... | N   |
*/
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_39 {
    public static void main (String args[]){
        Integer i, num;
        Double resp;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número e casas."));
        resp = 0.0;
        for(i=0;i<num;i++){
            resp += Math.pow(2,i);
            //JOptionPane.showMessageDialog(null,resp);
        }
        JOptionPane.showMessageDialog(null,"A quantidade de grãos é " +resp +".");
    }
}
