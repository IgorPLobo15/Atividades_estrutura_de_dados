package com.mycompany.ativ2_estrutura;

public class BuscaBinaria {
    public static int buscaBinaria(int numero, int[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == numero) {
                return meio;
            } else if (array[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}