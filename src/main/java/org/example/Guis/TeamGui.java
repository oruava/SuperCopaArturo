package org.example.Guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.example.Datos.DatosJugadores;
import org.example.Modelo.Equipo;

public class TeamGui extends JFrame {

    private JButton botonSalir;
    private JButton botonJugadores;
    private JLabel textoRanking;
    private JLabel textoMuestraRanking;
    private JLabel textoPaises;
    private JLabel Bandera;
    private JButton australiaButton;
    private JButton alemaniaButton;
    private JButton camerunButton;
    private JButton botonChile;

    public TeamGui() {

        Equipo chile = new Equipo(1,"Chile","3","bandera");
        Equipo camerun = new Equipo(2,"Camerun","1","bandera");
        Equipo australia = new Equipo(3,"Australia","4","bandera");
        Equipo alemania = new Equipo(4,"Alemania","2","bandera");


        setTitle("Login");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();


        panel.setLayout(new GridLayout(3, 2, 10, 10));




        panel.add(botonChile);
        panel.add(australiaButton);
        panel.add(alemaniaButton);
        panel.add(camerunButton);
        panel.add(textoRanking);
        panel.add(textoMuestraRanking);
        panel.add(textoPaises);
        panel.add(Bandera);
        panel.add(botonSalir);
        panel.add(botonJugadores);

        add(panel);
        setVisible(true);


        botonChile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(chile.getRanking());
                String rutaImagen = "src\\main\\resources\\chi.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
            }
        });
        alemaniaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(alemania.getRanking());
                String rutaImagen = "src\\main\\resources\\ger.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);

            }
        });
        camerunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(camerun.getRanking());
                String rutaImagen = "src\\main\\resources\\cmr.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
            }
        });
        australiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(australia.getRanking());
                String rutaImagen = "src\\main\\resources\\aus.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
            }
        });
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



    }
}
