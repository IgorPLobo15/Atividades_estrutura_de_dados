package com.mycompany.ativ2_estrutura;

public class BuscaLinear {
    public static int buscaLinear(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}