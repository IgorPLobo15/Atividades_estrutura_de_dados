package com.mycompany.ensino_ex2;
import java.io.*;

public class Buscar_Ensino {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Ensino.txt"));
            
            System.out.println ("Digite do Aluno: ");
            String nome = entrada.readLine();
            String curso = "";
            String turma = "";
            String periodo = "";
            String linha = "";            
            while ((linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n");
            }
            int inicio = -1;
            inicio = memoria.indexOf (nome);
            
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                nome = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                curso = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                turma = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                int fim = memoria.indexOf ("\n", primeiro);
                periodo = ler (primeiro, fim);
                
                regAluno regAlu = new regAluno (nome, curso,turma,periodo);

                System.out.println ("Nome: " + regAlu.mostraNome () +
                " Curso: " + regAlu.mostraCurso()+" Turma:"+regAlu.mostraTurma()+
                        " Período:"+regAlu.mostraPeriodo());
                System.out.println ("Entre com o novo curso:");
                curso = entrada.readLine();
                regAlu.alteraCurso(curso);
                System.out.println ("Entre com a nova turma:");
                turma = entrada.readLine();
                regAlu.alteraTurma (turma);
                System.out.println ("Entre com o novo período:");
                periodo = entrada.readLine();
                regAlu.alteraPeriodo (periodo);
                memoria.replace (inicio, fim, regAlu.mostraNome () + "\t" +
                regAlu.mostraCurso () + "\t" + regAlu.mostraTurma ()+ "\t" + regAlu.mostraPeriodo());
                gravar ();
                arqentrada.close ();
                }else{
                    System.out.println ("Item não encontrado");
                }
                arqentrada.close ();
                } catch (FileNotFoundException erro){
                    System.out.println ("Arquivo não encontrado!");
                    } catch (Exception erro){
                        System.out.println ("Erro de Leitura !");
                        }
                }
                public static String ler (int primeiro, int ultimo){
                    String dados = "";
                    char [] destino = new char [ultimo - primeiro];
                    memoria.getChars (primeiro, ultimo, destino, 0);
                    for (int i = 0; i < destino.length; i++){
                            dados += destino [i];
                    }
                    return dados;
                }
                public static void gravar (){
                    try{
                        BufferedWriter saida;
                        saida = new BufferedWriter (new FileWriter ("Ensino.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                }             
}

