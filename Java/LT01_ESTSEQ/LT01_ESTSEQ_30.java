/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nome do Programador: Lucas Sartorelli
 * Data: 22/02/2025
 * Descrição:
 * Receba a data de nascimento e atual em ano, mês e dia. 
 * Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_30 {
    static Integer calcmes(Integer mes){
        Integer dia, i;
        dia = 0;
        for(i=1;i<=mes;i++){
            switch(i){
                case 1,3,5,7,8,10,12:
                    dia += 31;
                    break;
                case 2:
                    dia += 28;
                    break;
                case 4,6,9,11:
                    dia += 30;
                    break;
            }
        }
        return dia;
    };
    
    static Integer calcdia(Integer dia){
        Integer i, mes;
        mes = 0;
        for(i=1;i<13;i++){
            if ((i==2) && (dia >= 28)){
		dia = dia - 28;
		mes = (mes + 1);
            }else if (((1 == i % 2) || (i < 8)) && (dia >= 31)){
		dia = dia - 31;
		mes = (mes + 1);
            }else if (((0 == i % 2) || (i < 8)) && (dia >= 30)){
		dia = dia - 30;
		mes = (mes + 1);
            }else if (((0 == i % 2) || (i >= 8)) && (dia >= 31)){
		dia = dia - 31;
		mes = (mes + 1);
            }else if (((1 == i % 2) || (i > 8)) && (dia >= 30)){
		dia = dia - 30;
		mes = (mes + 1);
            }
        }
        return mes;
    };
    
    public static void main(String args[]){
        Integer DDn, MMn, AAn, DDa, MMa, AAa, BissextoN, BissextoA;
        String full;
        
        //Input Loop
        do{
            //Input Nascimento
            //full = "12/08/1997";
            full = JOptionPane.showInputDialog("Insira a Data de nascimento em DD:MM:AAAA.");
            DDn = Integer.parseInt(full.substring(0,2));
            MMn = Integer.parseInt(full.substring(3,5));
            AAn = Integer.parseInt(full.substring(6));

            //JOptionPane.showMessageDialog(null, DDn +"?" +MMn +"?" +AAn);
        
            //Input Atual
            //full = "22/02/2025";
            full = JOptionPane.showInputDialog("Insira a Data Atual em DD:MM:AAAA.");
            DDa = Integer.parseInt(full.substring(0,2));
            MMa = Integer.parseInt(full.substring(3,5));
            AAa = Integer.parseInt(full.substring(6));
            
            if(AAn>AAa){
                JOptionPane.showMessageDialog(null,"Datas Inválidas.");
            }
        }while(AAn>AAa);
        //JOptionPane.showMessageDialog(null, DDa +"?" +MMa +"?" +AAa);
        
        //Calculo Bisexto
        BissextoN = ((AAn/4)-(AAn/100))+(AAn/400);
        BissextoA = ((AAa/4)-(AAa/100))+(AAa/400);
        
        //Calculo Ano -> Dia
        AAn *= 365;
        AAa *= 365;

        //JOptionPane.showMessageDialog(null, AAn +"?" +AAa);
        
        //Calculo mes -> Dia
        MMn = calcmes(MMn);
        MMa = calcmes(MMa);
        
        //JOptionPane.showMessageDialog(null, MMn +"?" +MMa);
        
        //Calculo Total
        DDn += (AAn+MMn+BissextoN);
        DDa += (AAa+MMa+BissextoA);
        DDa -= DDn;
        
        //JOptionPane.showMessageDialog(null, DDn +"?" +DDa);
        
        //Retorna a AA
        AAa = (DDa/365);
        DDa %= 365;
        
        //JOptionPane.showMessageDialog(null, AAa +"?" +DDa);
        
        //Retorna a MM
        MMa = calcdia(DDa);
        DDa -= calcmes(MMa);
        
        //JOptionPane.showMessageDialog(null, MMa +"?" +DDa);
        
        //Retira o Bissexto
        BissextoA -= BissextoN;
        DDa -= BissextoA;
        
        //JOptionPane.showMessageDialog(null, BissextoA +"?" +DDa);
        
        //Mostra Total
        JOptionPane.showMessageDialog(null, "A idade é " +AAa +"A:" +MMa +"M:" +DDa +"D.");
        
    }
}
