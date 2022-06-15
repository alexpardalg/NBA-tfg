package org.iesfm.nba;

import java.util.Objects;

public class Jugador {


    private int id;
    private String nombre;
    private String apellido;
    private String posicion;
    private String equipo;
    private String conferencia;

    public Jugador(int id, String nombre, String apellido, String posicion, String equipo, String conferencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.equipo = equipo;
        this.conferencia = conferencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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
        return id == jugador.id &&
                Objects.equals(nombre, jugador.nombre) &&
                Objects.equals(apellido, jugador.apellido) &&
                Objects.equals(posicion, jugador.posicion) &&
                Objects.equals(equipo, jugador.equipo) &&
                Objects.equals(conferencia, jugador.conferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, posicion, equipo, conferencia);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                ", conferencia='" + conferencia + '\'' +
                '}';
    }
}
