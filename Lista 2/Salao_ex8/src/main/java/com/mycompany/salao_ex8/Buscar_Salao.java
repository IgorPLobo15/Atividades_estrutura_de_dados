package com.mycompany.salao_ex8;
import java.io.*;

public class Buscar_Salao {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Salao.txt"));
            
            System.out.println ("Digite o Nome do Cliente");
            String nome = entrada.readLine();
            String dia = "";
            String horario = "";
            String servico = "";
            String valor = ""; 
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
                dia = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                horario = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                ultimo = memoria.indexOf ("\t", primeiro);
                servico = ler (primeiro, ultimo);
                primeiro = ultimo + 1;              
                int fim = memoria.indexOf ("\n", primeiro);             
                valor = ler (primeiro, fim);
                
                regSalao regSal = new regSalao (nome, dia,horario,servico,valor);

                System.out.println ("Cliente: " + regSal.mostraNome () +
                " Dia: " + regSal.mostraDia()+" Horário:"+regSal.mostraHorario()+
                        " Serviço:"+regSal.mostraServico()+" Valor:"+regSal.mostraValor());
                System.out.println ("Entre com o novo Dia:");
                dia = entrada.readLine();
                regSal.alteraDia (dia);
                System.out.println ("Entre com o novo Horário:");
                horario = entrada.readLine();
                regSal.alteraHorario (horario);
                System.out.println ("Entre com o novo Serviço:");
                servico = entrada.readLine();
                regSal.alteraServico (servico);
                memoria.replace (inicio, fim, regSal.mostraNome () + "\t" +
                regSal.mostraDia () + "\t" + regSal.mostraHorario ()+ "\t" + regSal.mostraServico ()+ "\t" + regSal.mostraValor ());
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
                        saida = new BufferedWriter (new FileWriter ("Salao.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                } 
}
