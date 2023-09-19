package com.mycompany.estru_ex1;

class PilhaInvertida {
    int tamanho;
    int topo;
    Object vetor[];

    PilhaInvertida(int tam) {
        topo = -1;
        tamanho = tam;
        vetor = new Object[tam];
    }

    public boolean vazia() {
        if (topo == -1)
            return true;
        else
            return false;
    }

    public boolean cheia() {
        if (topo >= tamanho)
            return true;
        else
            return false;
    }

    public void empilhar(Object elem) {
        if (!cheia()) {
            topo++;
            vetor[topo] = elem;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public void desempilhar(Object elem) {
        if (vazia() == true) {
            System.out.print("Pilha Vazia");
        } else {
            vetor[topo] = elem;
            topo--;
        }
    }

    public void exibePilha() {
        for (int i = topo; i >= 0; i--)
            System.out.println("Elemento " + vetor[i] + " posicao " + i);
    }
}