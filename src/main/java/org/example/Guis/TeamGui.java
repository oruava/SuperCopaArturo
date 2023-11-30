package org.example.Guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.example.Datos.DatosJugadores;
import org.example.Modelo.Equipo;
import org.example.Guis.JugadoresChileGUI;
import org.example.Guis.JugadoresAlemaniaGUI;
import org.example.Guis.JugadoresCamerunGUI;
import org.example.Guis.JugadoresAustraliaGUI;


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

        Equipo chile = new Equipo(3,"Chile","12","bandera");
        Equipo camerun = new Equipo(2,"Camerun","32","bandera");
        Equipo australia = new Equipo(1,"Australia","48","bandera");
        Equipo alemania = new Equipo(4,"Alemania","7","bandera");


        setTitle("Menu Teams");
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

        add(panel);
        setVisible(true);


        botonChile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(chile.getRanking());
                String rutaImagen = "src\\main\\resources\\imagenes\\chi.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
                JugadoresChileGUI ventanaChile = new JugadoresChileGUI();
            }
        });
        alemaniaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(alemania.getRanking());
                String rutaImagen = "src\\main\\resources\\imagenes\\ger.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
                JugadoresAlemaniaGUI ventanaAlemania = new JugadoresAlemaniaGUI();


            }
        });
        camerunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(camerun.getRanking());
                String rutaImagen = "src\\main\\resources\\imagenes\\cmr.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
                JugadoresCamerunGUI ventanaCamerun = new JugadoresCamerunGUI();

            }
        });
        australiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoMuestraRanking.setText(australia.getRanking());
                String rutaImagen = "src\\main\\resources\\imagenes\\aus.png";
                ImageIcon imagen = new ImageIcon(rutaImagen);
                Bandera.setIcon(imagen);
                JugadoresAustraliaGUI ventanaAustralia = new JugadoresAustraliaGUI();

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
