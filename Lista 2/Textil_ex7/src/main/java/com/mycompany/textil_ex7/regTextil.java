package com.mycompany.textil_ex7;

public class regTextil {
    private String tipo;
    private String tamanho;
    private String cor;
    private String modelo;
      
    public regTextil (String tip,String tamanh, String co,String model){
        tipo = tip;
        tamanho = tamanh;        
        cor = co;
        modelo = model;                
    }
    public String mostraTipo (){
        return tipo;
    } 
    public String mostraTamanho (){
        return tamanho;
    }
    public String mostraCor (){
        return cor;
    }
    public String mostraModelo(){
        return modelo;
    }       
    public void alteraTamanho(String tamanh){
        tamanho= tamanh;
    }
    public void alteraCor(String co){
        cor= co;
    }
    public void alteraModelo(String model){
        modelo= model;
    }
}

