
package com.mycompany.estru_ex2;

public class Fila {
    int tamanho;
    int inicio;
    int fim;
    int total;
    Object vetor[];

    Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new Object[tam];
    }

    public boolean vazia() {
        return total == 0;
    }

    public boolean cheia() {
        return total >= tamanho;
    }

    public void enfileirar(Object elem) {
        if (!cheia()) {
            vetor[fim] = elem;
            fim++;
            total++;
            if (fim >= tamanho) {
                fim = 0;
            }
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public Object desenfileirar() {
        if (!vazia()) {
            Object excluido = vetor[inicio];
            inicio++;
            if (inicio >= tamanho) {
                inicio = 0;
            }
            total--;
            return excluido;
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    public void exibeFila() {
        for (int i = inicio; i < total; i++) {
            System.out.println("posicao " + i + " valor " + vetor[i]);
        }
    }
}

