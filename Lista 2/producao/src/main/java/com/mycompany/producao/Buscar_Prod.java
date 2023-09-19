package com.mycompany.producao;
import java.io.*;

public class Buscar_Prod {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Producao.txt"));
            
            System.out.println ("Digite o Produto");
            String produto = entrada.readLine();
            String marca = "";
            String unidade = "";
            String valor = "";
            String quantidade = ""; 
            String linha = "";            
            while ((linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n");
            }
            int inicio = -1;
            inicio = memoria.indexOf (produto);
            
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                produto = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                marca = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                unidade = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                ultimo = memoria.indexOf ("\t", primeiro);
                valor = ler (primeiro, ultimo);
                primeiro = ultimo + 1;              
                int fim = memoria.indexOf ("\n", primeiro);             
                quantidade = ler (primeiro, fim);
                
                regProd regPro = new regProd (produto, marca,unidade,valor,quantidade);

                System.out.println ("Produto: " + regPro.mostraProduto () +
                " Marca: " + regPro.mostraMarca()+" Unidade:"+regPro.mostraUnidade()+
                        " Valor:"+regPro.mostraValor()+" Quantidade"+regPro.mostraQuantidade());
                System.out.println ("Entre com  a nova unidade");
                unidade = entrada.readLine();
                regPro.alteraUnidade (unidade);
                System.out.println ("Entre com o novo valor");
                valor = entrada.readLine();
                regPro.alteraValor (valor);
                System.out.println ("Entre com a nova quantidade");
                quantidade = entrada.readLine();
                regPro.alteraQuantidade (quantidade);
                memoria.replace (inicio, fim, regPro.mostraProduto () + "\t" +
                regPro.mostraMarca () + "\t" + regPro.mostraUnidade ()+ "\t" + regPro.mostraValor ()+ "\t" + regPro.mostraQuantidade ());
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
                        saida = new BufferedWriter (new FileWriter ("Producao.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                }             
}
        
        
        
        
        
        



















