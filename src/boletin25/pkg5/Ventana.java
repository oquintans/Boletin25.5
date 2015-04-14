/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25.pkg5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author oquintansocampo
 */
public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField etiqueta;

    public Ventana() {
        marco = new JFrame(" Evento ");
        panel = new JPanel();
        boton1 = new JButton(" Dibujar ");
        boton2 = new JButton(" Limpiar ");
        etiqueta = new JTextField(10);
        etiqueta.setText("0");
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta);
        marco.add(panel);

        marco.setSize(800, 600);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton1 == e.getSource()) {
            int tam = (int) (Math.random() * 80);
            int numCirculos = Integer.parseInt(etiqueta.getText());
            Graphics g = panel.getGraphics();
            for (int i = 0; i < numCirculos; i++) {
                g.setColor(Color.red);
                g.drawOval((int) (Math.random() * 700), (int) (Math.random() * 500), tam, tam);
            }

        } else if (boton2 == e.getSource()) {
            panel.repaint();
        }
    }

}
