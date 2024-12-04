package Pratica11;

import javax.swing.*;

public class JavaSwing extends JFrame {

    public JavaSwing() {
        setTitle("Janela em Java Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Ola, mundo!");

        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaSwing();
    }
}