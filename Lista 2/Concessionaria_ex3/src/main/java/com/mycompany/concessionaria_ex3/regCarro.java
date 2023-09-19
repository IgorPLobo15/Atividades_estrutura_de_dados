package com.mycompany.concessionaria_ex3;

public class regCarro {
    private String nome;
    private String marca;
    private String ano;
    private String cor;
      
    public regCarro (String nom, String marc,String an,String co){
        nome = nom;
        marca = marc;
        ano = an;
        cor = co;                
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraMarca (){
        return marca;
    }
    public String mostraAno (){
        return ano;
    }
    public String mostraCor (){
        return cor;
    }    
    public void alteraMarca(String marc){
        marca= marc;
    }
    public void alteraAno(String an){
        ano= an;
    }
    public void alteraCor(String co){
        cor= co;
    }
}
