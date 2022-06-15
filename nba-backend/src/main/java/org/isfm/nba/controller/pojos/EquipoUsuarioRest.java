package org.isfm.nba.controller.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class EquipoUsuarioRest {

    private String nombre;
    private List<Integer> idsJugador;

    @JsonCreator
    public EquipoUsuarioRest(@JsonProperty (value = "nombre" )String name,
                             @JsonProperty (value = "idsJugador") List<Integer> idsJugador) {
        this.nombre = name;
        this.idsJugador = idsJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getIdsJugador() {
        return idsJugador;
    }

    public void setIdsJugador(List<Integer> idsJugador) {
        this.idsJugador = idsJugador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipoUsuarioRest that = (EquipoUsuarioRest) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(idsJugador, that.idsJugador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, idsJugador);
    }

    @Override
    public String toString() {
        return "EquipoUsuarioRest{" +
                "nombre='" + nombre + '\'' +
                ", idsJugador=" + idsJugador +
                '}';
    }
}
