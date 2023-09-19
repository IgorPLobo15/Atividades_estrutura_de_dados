package com.mycompany.redesocial_ex5;
import java.io.*;

public class RedeSocial_ex5 {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("RedeSocial.txt",true));
            
            
            System.out.println("Digite o Nome:");
            String Nome= entrada.readLine();
            System.out.println("Digite a Rede Social:");
            String Rede= entrada.readLine();           
            System.out.println("Digite a Quantidade de seguidores:");
            String Quantidade= entrada.readLine();
            System.out.println("Digite o Tipo do Conteúdo:");
            String Tipo= entrada.readLine();
                                    
            regRede regRed= new regRede(Nome,Rede,Quantidade,Tipo);
            
            saida.write(regRed.mostraNome()+"\t");
            saida.write(regRed.mostraRede()+"\t");;
            saida.write(regRed.mostraQuantidade()+"\t");
            saida.write(regRed.mostraTipo()+"\n");            
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }
    }
}
