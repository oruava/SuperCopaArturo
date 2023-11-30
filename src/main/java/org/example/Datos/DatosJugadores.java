package org.example.Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.example.Modelo.Equipo;
import org.example.Modelo.Jugador;

import javax.swing.*;


public interface DatosJugadores {



    static void escribirCSV(String nombreArchivo, String[] datos) {
        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
            for (String dato : datos) {
                writer.append(dato).append(",");
            }
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String buscarPaisYDarRanking(String pais) {
        String ranking = "";
        try (BufferedReader br = new BufferedReader(new FileReader(pais+".csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(pais)) {
                    ranking =(datos[1]);
                    return ranking;
                }
            }
            System.out.println("Pais no encontrado: " + pais);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ranking;
    }

    static boolean buscarUsuarioOAdmin(String usuarioBuscado, String claveBuscado) {
        boolean permisos = true;
        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (usuarioBuscado.equals("admin")&& claveBuscado.equals("1234")) {

                    System.out.println("Usuario encontrado:");
                    System.out.println("Usuario: " + datos[0]);
                    System.out.println("Clave: " + datos[1]);
                    permisos = true;
                    return permisos;
                }
                else if (datos[0].equals(usuarioBuscado) && datos[1].equals(claveBuscado)){
                    permisos = false;
                    return permisos;
                }
            }
            System.out.println("Usuario no encontrado con Usuario: " + usuarioBuscado);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return permisos;
    }


    static void cambiarEstadoPrestadoPorID(String idBuscado, String nuevoEstado) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            StringBuilder nuevoContenido = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length > 0 && datos[0].equals(idBuscado)) {
                    datos[1] = nuevoEstado;
                    System.out.println("El estado prestado de la ID ingresada ha sido cambiado");
                }
                nuevoContenido.append(String.join(",", datos)).append("\n");
            }
            try (FileWriter writer = new FileWriter("datos.csv")) {
                writer.write(nuevoContenido.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}