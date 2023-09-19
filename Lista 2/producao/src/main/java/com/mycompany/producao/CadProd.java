package com.mycompany.producao;
import java.io.*;

public class CadProd {
    public static void main(String[] args) {
        try{
            BufferedReader entrada;
            entrada= new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter saida;
            saida =new BufferedWriter(new FileWriter("Producao.txt",true));
            
            System.out.println("Digite o Produto:");
            String Produto= entrada.readLine();
            System.out.println("Digite a marca:");
            String Marca= entrada.readLine();
            System.out.println("Digite a Unidade de medida:");
            String Unidade= entrada.readLine();
            System.out.println("Digite o Valor:");
            String Valor= entrada.readLine();
            System.out.println("Digite a quantidade:");
            String Quant= entrada.readLine();
            
            regProd regPro= new regProd(Produto,Marca,Unidade,Valor,Quant);
            
            saida.write(regPro.mostraProduto()+"\t");
            saida.write(regPro.mostraMarca()+"\t");
            saida.write(regPro.mostraUnidade()+"\t");
            saida.write(regPro.mostraValor()+"\t");
            saida.write(regPro.mostraQuantidade()+"\n");
            saida.flush();
            saida.close();
            }catch(Exception e){
                System.out.println("Erro no Cadastro");        
            }
    }
}
