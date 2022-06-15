package org.iesfm.nba;

import java.util.Objects;

public class Equipo {
    private final static String LEYENDAS= "Leyendas";

    private String nombre;
    private String conferencia;

    public Equipo(String nombre, String conferencia) {
        this.nombre = nombre;
        this.conferencia = conferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre) && Objects.equals(conferencia, equipo.conferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, conferencia);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", conferencia='" + conferencia + '\'' +
                '}';
    }
}
