package com.mycompany.academia_ex4;
import java.io.*;

public class Academia_ex4 {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Academia.txt",true));
            
            System.out.println("Digite o Nome da Academia:");
            String Nome= entrada.readLine();
            System.out.println("Digite a Atividade Física:");
            String AtivFisi= entrada.readLine();
            System.out.println("Digite o Aparelho ");
            String Aparelho= entrada.readLine();
            System.out.println("Digite o Horário:");
            String Horario= entrada.readLine();
            System.out.println("Digite o Dia de Treino");
            String Dia= entrada.readLine();
            
            regAcad regAca= new regAcad(Nome,AtivFisi,Aparelho,Horario,Dia);
            
            saida.write(regAca.mostraNome()+"\t");
            saida.write(regAca.mostraAtiviFisica()+"\t");
            saida.write(regAca.mostraAparelho()+"\t");
            saida.write(regAca.mostraHorario()+"\t");
            saida.write(regAca.mostraDia()+"\n");
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }
    }       
}

