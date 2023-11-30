package org.example.Modelo;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    int number;
    String name;

    String ranking;
    String flagPath;
    List<Jugador> jugadores;

    public Equipo(int id, String name, String ranking, String flagPath) {
        this.number = id;
        this.name = name;
        this.ranking = ranking;
        this.flagPath = flagPath;
        this.jugadores = new ArrayList<>();
    }

    public String  getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public void agregarPlayer(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void MostrarTeamInfo() {
        System.out.println("Team: " + name);
        System.out.println("Ranking: " + ranking);
        System.out.println("Flag Path: " + flagPath);
        System.out.println("Players:");

        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}