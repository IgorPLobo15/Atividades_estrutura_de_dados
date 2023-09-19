package com.mycompany.ativ2_estrutura;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BuscaGUI extends JFrame implements ActionListener {
    private JTextField campoNumero, campoArray;
    private JButton btnBuscaLinear, btnBuscaBinaria;
    private JLabel labelResultado,labelNumero;

    private int[] array;

    public BuscaGUI() {
        setTitle("Busca Linear e Binária");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

        labelNumero = new JLabel("Número:");
        campoNumero = new JTextField(10);
        campoArray = new JTextField();
        btnBuscaLinear = new JButton("Buscar Linear");
        btnBuscaBinaria = new JButton("Buscar Binária");
        labelResultado = new JLabel("");

        btnBuscaLinear.addActionListener(this);
        btnBuscaBinaria.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Array (separado por vírgulas):"));
        panel.add(campoArray);
        panel.add(labelNumero);
        panel.add(campoNumero);
        panel.add(btnBuscaLinear);
        panel.add(btnBuscaBinaria);
        panel.add(labelResultado);

        add(panel);
    
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscaLinear || e.getSource() == btnBuscaBinaria) {
            String[] numerosTexto = campoArray.getText().split(",");
            array = new int[numerosTexto.length];
            for (int i = 0; i < numerosTexto.length; i++) {
                array[i] = Integer.parseInt(numerosTexto[i]);
            }

            if (e.getSource() == btnBuscaLinear) {
                int numero = Integer.parseInt(campoNumero.getText());
                int posicao = BuscaLinear.buscaLinear(numero, array);
                if (posicao != -1) {
                    labelResultado.setText("Encontrado na posição " + posicao);
                } else {
                    labelResultado.setText("Não encontrado");
                }
            } else if (e.getSource() == btnBuscaBinaria) {
                int numero = Integer.parseInt(campoNumero.getText());
                Ordenamento.bubbleSort(array);
                int posicao = BuscaBinaria.buscaBinaria(numero, array);
                if (posicao != -1) {
                    labelResultado.setText("Encontrado na posição " + posicao);
                } else {
                    labelResultado.setText("Não encontrado");
                }
            }
        }
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BuscaGUI().setVisible(true);
            }
        });
    }
}
