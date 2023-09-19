package com.mycompany.aeoroporto_ex6;
import java.io.*;

public class Busca_aeroporto {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Aeroporto.txt"));
            
            System.out.println ("Digite o Número do Vôo");
            String num = entrada.readLine();
            String nome = "";
            String trecho = "";
            String partida = "";
            String chegada = ""; 
            String linha = "";            
            while ((linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n");
            }
            int inicio = -1;
            inicio = memoria.indexOf (num);
            
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                num = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                nome = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                trecho = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                ultimo = memoria.indexOf ("\t", primeiro);
                partida = ler (primeiro, ultimo);
                primeiro = ultimo + 1;              
                int fim = memoria.indexOf ("\n", primeiro);             
                chegada = ler (primeiro, fim);
                
                regAero regAer = new regAero (num, nome,trecho,partida,chegada);

                System.out.println ("Vôo: " + regAer.mostraNum () +
                " Companhia: " + regAer.mostraNome()+" Trecho:"+regAer.mostraTrecho()+
                        " Partida:"+regAer.mostraPartida()+" Chegada:"+regAer.mostraChegada());
                System.out.println ("Entre com o novo trecho separado por (-):");
                trecho = entrada.readLine();
                regAer.alteraTrecho (trecho);
                System.out.println ("Entre com o novo horário de Partida:");
                partida = entrada.readLine();
                regAer.alteraPartida (partida);
                System.out.println ("Entre com o novo horário de Chegada:");
                chegada = entrada.readLine();
                regAer.alteraChegada (chegada);
                memoria.replace (inicio, fim, regAer.mostraNum () + "\t" +
                regAer.mostraNome () + "\t" + regAer.mostraTrecho ()+ "\t" + regAer.mostraPartida ()+ "\t" + regAer.mostraChegada ());
                gravar ();
                arqentrada.close ();
                }else{
                    System.out.println ("Item nao encontrado");
                }
                arqentrada.close ();
                } catch (FileNotFoundException erro){
                    System.out.println ("Arquivo nao encontrado!");
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
                        saida = new BufferedWriter (new FileWriter ("Aeroporto.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                } 
}
