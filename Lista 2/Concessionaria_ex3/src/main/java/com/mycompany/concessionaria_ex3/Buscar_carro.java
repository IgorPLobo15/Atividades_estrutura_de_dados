package com.mycompany.concessionaria_ex3;
import java.io.*;

public class Buscar_carro {
    static StringBuffer memoria = new StringBuffer();
    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader arqentrada;
            arqentrada= new BufferedReader(new FileReader("Concessionaria.txt"));
            
            System.out.println ("Digite o Carro: ");
            String nome = entrada.readLine();
            String marca = "";
            String ano = "";
            String cor = "";
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
                marca = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                //int 
                ultimo = memoria.indexOf ("\t", primeiro);
                ano = ler (primeiro, ultimo);
                primeiro = ultimo + 1;                
                int fim = memoria.indexOf ("\n", primeiro);
                cor = ler (primeiro, fim);
                
                regCarro regCar = new regCarro (nome, marca,ano,cor);

                System.out.println ("Nome: " + regCar.mostraNome () +
                " Marca: " + regCar.mostraMarca()+" Ano: "+regCar.mostraAno()+
                        " Cor: "+regCar.mostraCor());
                System.out.println ("Entre com a nova Marca:");
                marca = entrada.readLine();
                regCar.alteraMarca(marca);
                System.out.println ("Entre com o novo Ano:");
                ano = entrada.readLine();
                regCar.alteraAno(ano);
                System.out.println ("Entre com a nova Cor:");
                cor = entrada.readLine();
                regCar.alteraCor(cor);
                memoria.replace (inicio, fim, regCar.mostraNome () + "\t" +
                regCar.mostraMarca () + "\t" + regCar.mostraAno ()+ "\t" + regCar.mostraCor());
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
                        saida = new BufferedWriter (new FileWriter ("Concessionaria.txt"));
                        saida.write (memoria.toString ());
                        saida.flush ();
                        saida.close ();
                    } catch (Exception erro){
                        System.out.println ("Erro de gravacao!");
                    }
                }     
}
