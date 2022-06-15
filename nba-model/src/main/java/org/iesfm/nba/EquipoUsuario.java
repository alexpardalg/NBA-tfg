package org.iesfm.nba;

import java.util.List;
import java.util.Objects;

public class EquipoUsuario {

    private String nombre;
    private List<Integer> IdsJugadores;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getIdsJugadores() {
        return IdsJugadores;
    }

    public void setIdsJugadores(List<Integer> idsJugadores) {
        IdsJugadores = idsJugadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipoUsuario that = (EquipoUsuario) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(IdsJugadores, that.IdsJugadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, IdsJugadores);
    }

    @Override
    public String toString() {
        return "EquipoUsuario{" +
                "nombre='" + nombre + '\'' +
                ", IdsJugadores=" + IdsJugadores +
                '}';
    }
}
