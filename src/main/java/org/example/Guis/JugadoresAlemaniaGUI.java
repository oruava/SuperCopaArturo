package org.example.Guis;

import org.example.Modelo.Equipo;

import javax.swing.*;
import java.awt.*;

public class JugadoresAlemaniaGUI extends JFrame {

    private JPanel panel1;



    public JugadoresAlemaniaGUI() {


        setTitle("Menu Teams");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel1 = new JPanel();


        panel1.setLayout(new GridLayout(3, 2, 10, 10));
    }
}
