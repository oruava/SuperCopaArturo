package org.example.Guis;

import org.example.Modelo.Equipo;

import javax.swing.*;
import java.awt.*;

public class JugadoresAustraliaGUI extends JFrame {
    private JPanel panel;



    public JugadoresAustraliaGUI() {


        setTitle("Menu Teams");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();


        panel.setLayout(new GridLayout(3, 2, 10, 10));
    }
}
