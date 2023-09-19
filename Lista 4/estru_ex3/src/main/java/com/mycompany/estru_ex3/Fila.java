package com.mycompany.estru_ex3;

/*
Variável fim:
Antes das alterações, a variável fim era inicializada como 0. No entanto, para implementar uma fila circular, a variável fim agora é inicializada como -1. 
Isso é importante porque, no início, a fila está vazia, e -1 indica que não há nenhum elemento na fila.

Método enfileirar:
O método enfileirar foi ajustado para calcular a nova posição do fim da fila. Em vez de simplesmente incrementar o fim, usamos a operação (fim + 1) % tamanho para calcular a nova posição. 
O operador % (módulo) é usado para garantir que a posição do fim permaneça dentro dos limites do tamanho da fila. Isso significa que, quando chegamos ao final do vetor, a próxima inserção ocorrerá na posição 0, 
criando o comportamento de fila circular.

Método desenfileirar:
O método desenfileirar também foi ajustado para calcular a nova posição do início da fila de forma circular, usando a mesma operação (início + 1) % tamanho. Isso garante que o início da fila seja atualizado adequadamente,
mesmo quando chegarmos ao final do vetor.

Método exibeFila:
O método exibeFila também foi modificado para calcular a posição atual de forma circular. Isso é feito usando a mesma operação (index + 1) % tamanho para garantir que a 
posição seja ajustada corretamente ao circular pelo vetor.
*/

public class Fila {
    int tamanho;
    int inicio;
    int fim;
    int total;
    Object vetor[];

    Fila(int tam) {
        inicio = 0;
        fim = -1;
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
            fim = (fim + 1) % tamanho; // Calcula a nova posição do fim (fila circular)
            vetor[fim] = elem;
            total++;
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public Object desenfileirar() {
        if (!vazia()) {
            Object excluido = vetor[inicio];
            inicio = (inicio + 1) % tamanho; // Calcula a nova posição do início (fila circular)
            total--;
            return excluido;
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    public void exibeFila() {
        int index = inicio;
        for (int i = 0; i < total; i++) {
            System.out.println("posicao " + index + " valor " + vetor[index]);
            index = (index + 1) % tamanho; // Calcula a nova posição (fila circular)
        }
    }
}

