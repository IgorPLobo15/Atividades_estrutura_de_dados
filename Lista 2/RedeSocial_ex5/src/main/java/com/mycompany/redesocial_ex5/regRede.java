package com.mycompany.redesocial_ex5;

public class regRede {
    private String rede;
    private String nome;
    private String quantidade;
    private String tipo;
      
    public regRede (String nom, String red,String quantidad,String tip){
        rede = red;
        nome = nom;        
        quantidade = quantidad;
        tipo = tip;                
    }
    public String mostraRede (){
        return rede;
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraQuantidade (){
        return quantidade;
    }
    public String mostraTipo (){
        return tipo;
    }    
    public void alteraRede(String red){
        rede= red;
    }
    public void alteraQuantidade(String quantidad){
        quantidade= quantidad;
    }
    public void alteraTipo(String tip){
        tipo= tip;
    }
}
