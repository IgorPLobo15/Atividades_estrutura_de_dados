package com.mycompany.textil_ex7;
import java.io.*;

public class Textil_ex7 {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Textil.txt",true));
            
            
            System.out.println("Digite o Tipo de roupa:");
            String Tipo= entrada.readLine();
            System.out.println("Digite o Tamanho:");
            String Tamanho= entrada.readLine();           
            System.out.println("Digite a Cor:");
            String Cor= entrada.readLine();
            System.out.println("Digite o Modelo(masculino, feminino, unisex):");
            String Modelo= entrada.readLine();
                                    
            regTextil regTex= new regTextil(Tipo,Tamanho,Cor,Modelo);
            
            saida.write(regTex.mostraTipo()+"\t");
            saida.write(regTex.mostraTamanho()+"\t");;
            saida.write(regTex.mostraCor()+"\t");
            saida.write(regTex.mostraModelo()+"\n");            
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }       
    }
}
