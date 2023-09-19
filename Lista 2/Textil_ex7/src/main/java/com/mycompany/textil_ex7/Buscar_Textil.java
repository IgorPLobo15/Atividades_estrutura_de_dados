package com.mycompany.textil_ex7;
import java.io.*;

public class Buscar_Textil {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Textil.txt"));
            
            System.out.println ("Digite o tipo da roupa: ");
            String tipo = entrada.readLine();
            String tamanho = "";
            String cor = "";
            String modelo = "";
            String linha = "";            
            while ((linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n");
            }
            int inicio = -1;
            inicio = memoria.indexOf (tipo);
            
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                tipo = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                tamanho = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                cor = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                int fim = memoria.indexOf ("\n", primeiro);
                modelo = ler (primeiro, fim);
                
                regTextil regTex = new regTextil (tipo, tamanho,cor,modelo);

                System.out.println ("Tipo: " + regTex.mostraTipo () +
                " Tamanho: " + regTex.mostraTamanho()+" Cor:"+regTex.mostraCor()+
                        " Modelo:"+regTex.mostraModelo());
                System.out.println ("Entre com o novo Tamanho:");
                tamanho = entrada.readLine();
                regTex.alteraTamanho(tamanho);
                System.out.println ("Entre com a nova nova Cor:");
                cor = entrada.readLine();
                regTex.alteraCor (cor);
                System.out.println ("Entre com o novo Modelo:");
                modelo = entrada.readLine();
                regTex.alteraModelo (modelo);
                memoria.replace (inicio, fim, regTex.mostraTipo () + "\t" +
                regTex.mostraTamanho () + "\t" + regTex.mostraCor ()+ "\t" + regTex.mostraModelo());
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
                        saida = new BufferedWriter (new FileWriter ("Textil.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                } 
}
