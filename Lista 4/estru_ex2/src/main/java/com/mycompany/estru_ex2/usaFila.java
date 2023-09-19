package com.mycompany.estru_ex2;
import java.io.*;

/*
Criação da Classe FilaInvertida:
Foi criada uma nova classe chamada FilaInvertida que estende a classe original Fila. 
Essa nova classe é responsável por implementar a lógica da fila invertida.

Construtor da Classe FilaInvertida:
O construtor da classe FilaInvertida foi definido para chamar o construtor da classe Fila e inicializar a fila invertida com o tamanho especificado.

Método inserirInvertido:
Foi adicionado o método inserirInvertido, que permite inserir elementos na fila invertida. 
Nesse método, verificamos se a fila está cheia e, em seguida, inserimos o elemento na posição anterior à posição inicial da fila, 
fazendo com que os elementos sejam adicionados no sentido inverso.

Método descarregar:
Foi adicionado o método descarregar, que permite descarregar elementos da fila invertida. 
Nesse método, verificamos se a fila não está vazia e, em seguida, retiramos o elemento da posição inicial da fila invertida, 
fazendo com que os elementos sejam retirados no sentido inverso.

Método exibeFilaInvertida:
Foi adicionado o método exibeFilaInvertida, que exibe os elementos da fila invertida na ordem em que estão armazenados. 
Ele leva em consideração a inversão na ordem de armazenamento dos elementos.

Menu Principal:
No método main, o menu principal foi atualizado para incluir as novas opções de "Inserir" e "Descarregar" na fila invertida, além de "Exibir a Fila Invertida" e "Sair".

Switch-Case no Método main:
No bloco switch-case dentro do método main, as opções "1" e "2" correspondem agora às operações de inserção e descarga na fila invertida da classe FilaInvertida.

Essas mudanças permitem que você trabalhe com uma fila invertida, onde os elementos são inseridos e descarregados de forma oposta à fila tradicional. 
Por exemplo, ao inserir um elemento, ele será adicionado na parte frontal da fila, e ao descarregar um elemento, o elemento da parte frontal da fila será removido. 
Isso cria uma lógica de fila invertida
*/

public class usaFila {
    public static void escolhas() {    
        System.out.println("Escolha a Opcao:");
        System.out.print("\n1. Inserir");
        System.out.print(" \n2. Descarregar");
        System.out.print(" \n3. Exibir a Fila invertida");
        System.out.print(" \n4. Sair");
        System.out.print("\n. Opcao :\t ");
    }

    public static void main(String args[]) {
        FilaInvertida objFila = new FilaInvertida(4);
        BufferedReader entrada;
        entrada = new BufferedReader(new InputStreamReader(System.in));
        Object valor;
        try {
            escolhas();
            char opcao = entrada.readLine().charAt(0);
            while (opcao != '4') {
                switch (opcao) {
                    case '1':
                        if (!objFila.cheia()) {
                            System.out.println("Digite Valor: ");
                            valor = entrada.readLine();
                            objFila.inserirInvertido(valor);
                        } else {
                            System.out.println("Fila Cheia ! ");
                        }
                        break;
                    case '2':
                        if (!objFila.vazia()) {
                            System.out.println(objFila.descarregar());
                        } else {
                            System.out.println("Fila Vazia ! ");
                        }
                        break;
                    case '3':
                        objFila.exibeFilaInvertida();
                        break;
                    default:
                        System.out.println("Opcao Invalida !");
                }
                System.out.println();
                escolhas();
                opcao = entrada.readLine().charAt(0);
            }
        } catch (Exception erro) {
            System.out.println("Erro de Entrada de Dados");
        }
    }
}
