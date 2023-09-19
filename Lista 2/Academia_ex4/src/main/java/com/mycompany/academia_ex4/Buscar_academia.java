package com.mycompany.academia_ex4;
import java.io.*;

public class Buscar_academia {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Academia.txt"));
            
            System.out.println ("Digite a Academia");
            String nome = entrada.readLine();
            String ativfisi = "";
            String aparelho = "";
            String horario = "";
            String dia = ""; 
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
                ativfisi = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                aparelho = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                ultimo = memoria.indexOf ("\t", primeiro);
                horario = ler (primeiro, ultimo);
                primeiro = ultimo + 1;              
                int fim = memoria.indexOf ("\n", primeiro);             
                dia = ler (primeiro, fim);
                
                regAcad regAca = new regAcad (nome, ativfisi,aparelho,horario,dia);

                System.out.println ("Academia: " + regAca.mostraNome () +
                " Atividade Física: " + regAca.mostraAtiviFisica()+" Aparelho:"+regAca.mostraAparelho()+
                        " Horário:"+regAca.mostraHorario()+" Dia:"+regAca.mostraDia());
                System.out.println ("Entre com  a nova Atividade Física:");
                ativfisi = entrada.readLine();
                regAca.alteraAtivFisica (ativfisi);
                System.out.println ("Entre com o novo Aparelho:");
                aparelho = entrada.readLine();
                regAca.alteraAparelho (aparelho);
                System.out.println ("Entre com o novo Horário:");
                horario = entrada.readLine();
                regAca.alteraHorario (horario);
                memoria.replace (inicio, fim, regAca.mostraNome () + "\t" +
                regAca.mostraAtiviFisica () + "\t" + regAca.mostraAparelho ()+ "\t" + regAca.mostraHorario ()+ "\t" + regAca.mostraDia ());
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
                        saida = new BufferedWriter (new FileWriter ("Academia.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                }   
}
