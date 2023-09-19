package com.mycompany.producao;


public class regProd {
    private String produto;
    private String marca;
    private String unidade;
    private String valor;
    private String quant;
   
    public regProd (String produt, String marc,String unidad,String valo,String quantidad){
        produto = produt;
        marca = marc;
        unidade = unidad;
        valor = valo;
        quant = quantidad;
        
    }
    public String mostraProduto (){
        return produto;
    }
    public String mostraMarca (){
        return marca;
    }
    public String mostraUnidade (){
        return unidade;
    }
    public String mostraValor (){
        return valor;
    }
    public String mostraQuantidade (){
        return quant;
    }
    public void alteraUnidade(String unidad){
        unidade= unidad;
    }
    public void alteraValor(String valo){
        valor= valo;
    }
    public void alteraQuantidade(String quantidad){
        quant= quantidad;
    }
}
    
       
            

