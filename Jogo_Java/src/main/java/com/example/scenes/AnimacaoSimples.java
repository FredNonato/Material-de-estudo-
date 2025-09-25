package com.example.scenes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimacaoSimples extends JPanel implements ActionListener {
    private int x = 0;
    private Timer timer;

    public AnimacaoSimples() {
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, 50, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 5;
        if (x > getWidth()) x = 0;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animação");
        AnimacaoSimples animacao = new AnimacaoSimples();
        frame.add(animacao);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}