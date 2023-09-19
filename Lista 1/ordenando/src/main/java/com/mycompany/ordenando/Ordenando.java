package com.mycompany.ordenando;
import javax.swing.JOptionPane;

public class Ordenando {

    public static void main(String[] args) {
       int num[] = new int[10];
       for (int i =0;i<num.length;i++){
           int number = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores:"));
           num[i]= number;
       }
       
       bolha ordem = new bolha();
       ordem.fazerbolha(num);
       
        for (int i=0;i<num.length;i++)
           System.out.println(num[i]);
    }
}
