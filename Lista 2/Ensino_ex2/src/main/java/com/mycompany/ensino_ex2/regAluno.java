package com.mycompany.ensino_ex2;
import java.io.*;

public class regAluno {
    private String nome;
    private String curso;
    private String turma;
    private String periodo;
      
    public regAluno (String nom, String curs,String turm,String period){
        nome = nom;
        curso = curs;
        turma = turm;
        periodo = period;                
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraCurso (){
        return curso;
    }
    public String mostraTurma (){
        return turma;
    }
    public String mostraPeriodo (){
        return periodo;
    }    
    public void alteraCurso(String curs){
        curso= curs;
    }
    public void alteraTurma(String turm){
        turma= turm;
    }
    public void alteraPeriodo(String period){
        periodo= period;
    }
}
    

