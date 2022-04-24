package org.iesfm.nba;

import java.util.Objects;

public class Jugador {

    private String nombre;
    private String apellido;
    private int numero;
    private String equipo;
    private String conferencia;

    public Jugador(String nombre, String apellido, int numero, String equipo, String conferencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.equipo = equipo;
        this.conferencia = conferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getConferencia() {
        return conferencia;
    }

    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return numero == jugador.numero &&
                Objects.equals(nombre, jugador.nombre) &&
                Objects.equals(apellido, jugador.apellido) &&
                Objects.equals(equipo, jugador.equipo) &&
                Objects.equals(conferencia, jugador.conferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, numero, equipo, conferencia);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numero=" + numero +
                ", equipo='" + equipo + '\'' +
                ", conferencia='" + conferencia + '\'' +
                '}';
    }
}
