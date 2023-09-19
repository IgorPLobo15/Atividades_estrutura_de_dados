package com.mycompany.estru_ex2;
import java.io.*;


public class FilaInvertida extends Fila {
    FilaInvertida(int tam) {
        super(tam);
    }

    public void inserirInvertido(Object elem) {
        if (!cheia()) {
            if (inicio == 0) {
                inicio = tamanho - 1;
            } else {
                inicio--;
            }
            vetor[inicio] = elem;
            total++;
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public Object descarregar() {
        if (!vazia()) {
            Object excluido = vetor[inicio];
            if (inicio == tamanho - 1) {
                inicio = 0;
            } else {
                inicio++;
            }
            total--;
            return excluido;
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    public void exibeFilaInvertida() {
        int index = inicio;
        for (int i = 0; i < total; i++) {
            System.out.println("posicao " + index + " valor " + vetor[index]);
            if (index == tamanho - 1) {
                index = 0;
            } else {
                index++;
            }
        }
    }
}



