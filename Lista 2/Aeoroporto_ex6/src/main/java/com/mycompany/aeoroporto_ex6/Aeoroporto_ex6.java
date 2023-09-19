package com.mycompany.aeoroporto_ex6;
import java.io.*;

public class Aeoroporto_ex6 {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Aeroporto.txt",true));
            
            System.out.println("Digite o número do Voo");
            String Num= entrada.readLine();
            System.out.println("Digite a Companhia Aérea:");
            String Nome= entrada.readLine();
            System.out.println("Digite o trecho do vôo separado por(-): ");
            String Trecho= entrada.readLine();
            System.out.println("Digite o Horário de Partida:");
            String Partida= entrada.readLine();
            System.out.println("Digite o Hórario de Chegada");
            String Chegada= entrada.readLine();
            
            regAero regAca= new regAero(Num,Nome,Trecho,Partida,Chegada);
            
            saida.write(regAca.mostraNum()+"\t");
            saida.write(regAca.mostraNome()+"\t");
            saida.write(regAca.mostraTrecho()+"\t");
            saida.write(regAca.mostraPartida()+"\t");
            saida.write(regAca.mostraChegada()+"\n");
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }
    }
}
