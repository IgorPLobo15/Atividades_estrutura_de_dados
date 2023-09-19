package com.mycompany.redesocial_ex5;
import java.io.*;

public class Buscar_Rede {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("RedeSocial.txt"));
            
            System.out.println ("Digite o nome da Pessoa: ");
            String nome = entrada.readLine();
            String rede = "";
            String quantidade = "";
            String tipo = "";
            String linha = "";            
            while ((linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n");
            }
            int inicio = -1;
            inicio = memoria.indexOf (nome);
            
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                rede = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                nome = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                quantidade = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                int fim = memoria.indexOf ("\n", primeiro);
                tipo = ler (primeiro, fim);
                
                regRede regRed = new regRede (nome, rede,quantidade,tipo);

                System.out.println ("Nome: " + regRed.mostraNome () +
                " Rede Social: " + regRed.mostraRede()+" Quantidade De Seguidores:"+regRed.mostraQuantidade()+
                        " Tipo do Conteúdo:"+regRed.mostraTipo());
                System.out.println ("Entre com a nova Rede Social:");
                rede = entrada.readLine();
                regRed.alteraRede(rede);
                System.out.println ("Entre com a nova quantidade de Seguidores:");
                quantidade = entrada.readLine();
                regRed.alteraQuantidade (quantidade);
                System.out.println ("Entre com o novo Conteúdo:");
                tipo = entrada.readLine();
                regRed.alteraTipo (tipo);
                memoria.replace (inicio, fim, regRed.mostraNome () + "\t" +
                regRed.mostraRede () + "\t" + regRed.mostraQuantidade ()+ "\t" + regRed.mostraTipo());
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
                        saida = new BufferedWriter (new FileWriter ("RedeSocial.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                }   
}
