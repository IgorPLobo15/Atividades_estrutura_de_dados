package com.mycompany.concessionaria_ex3;
import java.io.*;

public class Concessionaria_ex3 {
    public static void main(String[] args) {
       try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Concessionaria.txt",true));
            
            System.out.println("Digite o nome do Carro:");
            String Nome= entrada.readLine();
            System.out.println("Digite a Marca:");
            String Marca= entrada.readLine();
            System.out.println("Digite o Ano:");
            String Ano= entrada.readLine();
            System.out.println("Digite a Cor:");
            String Cor= entrada.readLine();
                                    
            regCarro regCar= new regCarro(Nome,Marca,Ano,Cor);
            
            saida.write(regCar.mostraNome()+"\t");
            saida.write(regCar.mostraMarca()+"\t");
            saida.write(regCar.mostraAno()+"\t");
            saida.write(regCar.mostraCor()+"\t");            
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            } 
    }
}
