package com.mycompany.salao_ex8;
import java.io.*;

public class Salao_ex8 {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Salao.txt",true));
            
            System.out.println("Digite o nome do cliente:");
            String Nome= entrada.readLine();
            System.out.println("Digite o Dia da semana:");
            String Dia= entrada.readLine();
            System.out.println("Digite o Horário:");
            String Horario= entrada.readLine();
            System.out.println("Digite o Serviço:");
            String Servico= entrada.readLine();
            System.out.println("Digite o Valor:");
            String Valor= entrada.readLine();
            
            regSalao regSal= new regSalao(Nome,Dia,Horario,Servico,Valor);
            
            saida.write(regSal.mostraNome()+"\t");
            saida.write(regSal.mostraDia()+"\t");
            saida.write(regSal.mostraHorario()+"\t");
            saida.write(regSal.mostraServico()+"\t");
            saida.write(regSal.mostraValor()+"\n");
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }
    }
}
