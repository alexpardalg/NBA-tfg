package org.iesfm.nba;

import java.util.List;
import java.util.Objects;

public class Conferencia {

    private String nombre;
    private List<Equipo> equipos;

    public Conferencia(String nombre, List<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conferencia that = (Conferencia) o;
        return Objects.equals(nombre, that.nombre) &&
                Objects.equals(equipos, that.equipos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, equipos);
    }

    @Override
    public String toString() {
        return "Conferencia{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + equipos +
                '}';
    }
}
