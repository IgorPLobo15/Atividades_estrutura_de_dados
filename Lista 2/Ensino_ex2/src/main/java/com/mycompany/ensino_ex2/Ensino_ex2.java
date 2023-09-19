package com.mycompany.ensino_ex2;
import java.io.*;

public class Ensino_ex2 {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Ensino.txt",true));
            
            System.out.println("Digite o nome:");
            String Nome= entrada.readLine();
            System.out.println("Digite a curso:");
            String Curso= entrada.readLine();
            System.out.println("Digite a turma:");
            String Turma= entrada.readLine();
            System.out.println("Digite o período:");
            String Periodo= entrada.readLine();
                                    
            regAluno regAlu= new regAluno(Nome,Curso,Turma,Periodo);
            
            saida.write(regAlu.mostraNome()+"\t");
            saida.write(regAlu.mostraCurso()+"\t");
            saida.write(regAlu.mostraTurma()+"\t");
            saida.write(regAlu.mostraPeriodo()+"\nmm");            
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }
    }    
}

