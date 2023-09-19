package com.mycompany.aeoroporto_ex6;

public class regAero {
    private String num;
    private String nome;
    private String trecho;
    private String partida;
    private String chegada;
   
    public regAero (String nu, String nom,String trech,String partid,String chegad){
        nome = nom;
        num = nu;
        trecho = trech;
        partida = partid;
        chegada = chegad;
        
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraNum (){
        return num;
    }
    public String mostraTrecho (){
        return trecho;
    }
    public String mostraPartida (){
        return partida;
    }
    public String mostraChegada (){
        return chegada;
    }
    public void alteraTrecho(String trech){
        trecho= trech;
    }
    public void alteraPartida(String partid){
        partida= partid;
    }
    public void alteraChegada(String chegad){
        chegada= chegad;
    }
} 

