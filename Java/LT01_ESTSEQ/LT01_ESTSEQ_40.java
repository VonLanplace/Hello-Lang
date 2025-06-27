/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Nome do Programador: Lucas Sartorelli
* Data: 22/02/2025
* Descrição:
* Receba 2 números inteiros. 
* Verifique e mostre todos os números primos existentes entre eles.
 */
import javax.swing.JOptionPane;
public class LT01_ESTSEQ_40 {
    public static void main(String args[]){
        Integer min, max, i, j;
        do{
            min = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor Mínimo."));
            if(min<0){JOptionPane.showMessageDialog(null,"Valor Inválido.");}
        }while(min<0);
        
        do{
            max = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor Máximo."));
            if(max<=min){JOptionPane.showMessageDialog(null,"Valor Inválido.");}
        }while(max<=min);
        //min = 0;
        //max = 10;
                
        for(i=(min+1);i<max;i++){
            //JOptionPane.showMessageDialog(null, i +"=i");
            //i é o número a ser testado.
            for(j=(i-1);j>1;j--){
                //JOptionPane.showMessageDialog(null, j);
                //j é o número testando.
                if((i%j)==0){
                    //Não é primo.
                    j=-1;
                    JOptionPane.showMessageDialog(null, "O número " +i +" não é primo.");
                }
            }
            if(j != -2){
                JOptionPane.showMessageDialog(null, "O número " +i +" é primo.");
            }
        }
    }
}
