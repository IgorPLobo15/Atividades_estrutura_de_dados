package com.mycompany.salao_ex8;

public class regSalao {
    private String nome;
    private String dia;
    private String horario;
    private String servico;
    private String valor;
   
    public regSalao (String nom, String di,String horari,String servic,String valo){
        nome = nom;
        dia = di;
        horario = horari;
        valor = valo;
        servico = servic;
        
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraDia (){
        return dia;
    }
    public String mostraHorario (){
        return horario;
    }
    public String mostraServico (){
        return valor;
    }
    public String mostraValor (){
        return servico;
    }
    public void alteraDia(String di){
        dia= di;
    }
    public void alteraHorario(String horari){
        horario= horari;
    }
    public void alteraServico(String servic){
        servico= servic;
    }
}
