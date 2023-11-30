package org.example.Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.example.Modelo.Equipo;
import org.example.Modelo.Jugador;

import javax.swing.*;


public interface DatosJugadores {


    static String LeerArchivoTextoDevuelveNumero(String rutaArchivo) {

        try (FileReader fileReader = new FileReader(rutaArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] columnas = linea.split("\t");

                if (columnas.length > 0) {
                    return (columnas[0]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    static String LeerArchivoTextoDevuelveNombre(String rutaArchivo) {

        try (FileReader fileReader = new FileReader(rutaArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] columnas = linea.split("\t");

                if (columnas.length > 1) {
                    return (columnas[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    static String LeerArchivoTextoDevuelvePosicion(String rutaArchivo) {

        try (FileReader fileReader = new FileReader(rutaArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] columnas = linea.split("\t");

                if (columnas.length > 2) {
                    return (columnas[2]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}



