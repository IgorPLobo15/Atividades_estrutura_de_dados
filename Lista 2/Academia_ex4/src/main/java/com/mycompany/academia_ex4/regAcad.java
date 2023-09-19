package com.mycompany.academia_ex4;

public class regAcad {
    private String nome;
    private String ativfisi;
    private String aparelho;
    private String horario;
    private String dia;
   
    public regAcad (String nom, String ativfis,String aparelh,String horari,String di){
        nome = nom;
        ativfisi = ativfis;
        aparelho = aparelh;
        horario = horari;
        dia = di;
        
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraAtiviFisica (){
        return ativfisi;
    }
    public String mostraAparelho (){
        return aparelho;
    }
    public String mostraHorario (){
        return horario;
    }
    public String mostraDia (){
        return dia;
    }
    public void alteraAtivFisica(String ativfis){
        ativfisi= ativfis;
    }
    public void alteraAparelho(String aparelh){
        aparelho= aparelh;
    }
    public void alteraHorario(String horari){
        horario= horari;
    }
}
