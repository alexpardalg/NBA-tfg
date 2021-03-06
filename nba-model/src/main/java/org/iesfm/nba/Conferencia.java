package org.iesfm.nba;

import java.util.List;
import java.util.Objects;

public class Conferencia {

    private String nombre;

    public Conferencia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conferencia that = (Conferencia) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Conferencia{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
