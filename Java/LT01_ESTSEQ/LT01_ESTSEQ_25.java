/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba a hora de início e de final de um jogo $(HH,MM)$, 
 * calcular o tempo do jogo em horas e minutos, 
 * sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_25 {
    public static void main(String args[]){
        String HHMM;
        Integer HHi, MMi, HHj, MMj;
        //Input Start
        do{
            HHMM = JOptionPane.showInputDialog("Insira o a hora do início do Jogo em HH:MM.");
            HHi = Integer.parseInt(HHMM.substring(0,2));
            MMi = Integer.parseInt(HHMM.substring(3));
            if(((MMi>=60)||(MMi<0))||((HHi>=24)||(HHi<0))){
                JOptionPane.showMessageDialog(null,"Valor Inválido.");
            }
        }while(((MMi>=60)||(MMi<0))||((HHi>=24)||(HHi<0)));
        //Input Final
        do{
            HHMM = JOptionPane.showInputDialog("Insira o a hora do final do Jogo em HH:MM.");
            HHj = Integer.parseInt(HHMM.substring(0,2));
            MMj = Integer.parseInt(HHMM.substring(3));
            if(((MMj>=60)||(MMj<0))||((HHj>=24)||(HHj<0))){
                JOptionPane.showMessageDialog(null,"Valor Inválido.");
            }
        }while(((MMj>=60)||(MMj<0))||((HHj>=24)||(HHj<0)));
        
        //Calculo Hora
        HHi = ((HHi*60)+MMi);
        HHj = ((HHj*60)+MMj);
        
        if (HHj > HHi){
            HHj = (HHj - HHi);
        }else{
            if (HHj < HHi){
                HHj = ((1440 - HHi) + HHj);
            }else{
                HHj = 0;
            }
        }
        //Out
        MMj = (HHj % 60);
        HHj = (HHj / 60);
        JOptionPane.showMessageDialog(null,"O Tempo de Jogo é " +HHj +":" +MMj);
    }
}
