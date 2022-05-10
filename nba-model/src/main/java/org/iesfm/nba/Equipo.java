package org.iesfm.nba;

import java.util.List;
import java.util.Objects;

public class Equipo {

    private String nombre;
    private String ciudad;
    private Conferencia conferencia;
    private List<Jugador> jugadores;

    public Equipo(String nombre, String ciudad, Conferencia conferencia, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.conferencia = conferencia;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre) &&
                Objects.equals(ciudad, equipo.ciudad) &&
                Objects.equals(conferencia, equipo.conferencia) &&
                Objects.equals(jugadores, equipo.jugadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ciudad, conferencia, jugadores);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", conferencia=" + conferencia +
                ", jugadores=" + jugadores +
                '}';
    }
}
