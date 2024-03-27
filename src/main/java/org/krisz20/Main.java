package org.krisz20;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Numero 1:"));
        JTextField numero1 = new JTextField();
        add(numero1);

        add(new JLabel("Numero 2:"));
        JTextField numero2 = new JTextField();
        add(numero2);

        add(new JLabel("Resultado:"));
        JTextField resultado = new JTextField();
        add(resultado);
    }

    public static void main(String[] args) {
        new Main();
    }
}