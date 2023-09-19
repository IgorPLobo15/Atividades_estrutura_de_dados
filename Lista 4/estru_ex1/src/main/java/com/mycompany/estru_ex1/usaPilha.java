package com.mycompany.estru_ex1;
import java.io.*;

/*Inverta a lógica de empilhar e desempilhar:

No método empilhar, você deve decrementar o topo em vez de incrementá-lo.
No método desempilhar, você deve incrementar o topo em vez de decrementá-lo.
Mude os nomes das opções para refletir as operações opostas, por exemplo:

"Inserir" pode ser alterado para "Remover".
"Saída-Descarregar-Pilha" pode ser alterado para "Entrada-Carregar-Pilha".*/


class usaPilha{
    public static void escolhas() {
        System.out.println("Escolha a Opcao:");
        System.out.print("\n1. Remover");
        System.out.print(" \n2. Entrada-Carregar-Pilha");
        System.out.print(" \n3. Exibir a Pilha Invertida");
        System.out.print(" \n4. Sair");
        System.out.print("\n. Opcao :\t ");
    }

    public static void main(String args[]) {
        PilhaInvertida objPilha = new PilhaInvertida(4);
        BufferedReader entrada;
        entrada = new BufferedReader(new InputStreamReader(System.in));
        Object valor;
        try {
            escolhas();
            char opcao = entrada.readLine().charAt(0);
            while (opcao != '4') {
                switch (opcao) {
                    case '1':
                        if (objPilha.vazia() == false) {
                            System.out.println("Digite valor: ");
                            valor = entrada.readLine();
                            objPilha.desempilhar(valor);
                        } else {
                            System.out.println("Pilha Vazia ! ");
                        }
                        break;
                    case '2':
                        if (objPilha.cheia() == false) {
                            System.out.println("Digite valor: ");
                            valor = entrada.readLine();
                            objPilha.empilhar(valor);
                        } else {
                            System.out.println("Pilha Cheia ! ");
                        }
                        break;
                    case '3':
                        objPilha.exibePilha();
                        break;
                    default:
                        System.out.println("Opcao Invalida !");
                }
                System.out.println();
                escolhas();
                opcao = entrada.readLine().charAt(0);
            }
        } catch (Exception erro) {
            System.out.println("Erro de Entrada de Dados. Provável Pilha Cheia");
        }
    }
}
