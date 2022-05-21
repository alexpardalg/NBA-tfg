package org.isfm.nba.controller.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.iesfm.nba.Conferencia;

import java.util.Objects;

public class EquipoRest {

    private String nombre;
    private Conferencia conferencia;

    @JsonCreator
    public EquipoRest(@JsonProperty(value = "nombre") String nombre,
                      @JsonProperty(value = "nombre_conferencia") Conferencia conferencia) {
        this.nombre = nombre;
        this.conferencia = conferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipoRest that = (EquipoRest) o;
        return Objects.equals(nombre, that.nombre) &&
                Objects.equals(conferencia, that.conferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, conferencia);
    }

    @Override
    public String toString() {
        return "EquipoRest{" +
                "nombre='" + nombre + '\'' +
                ", conferencia=" + conferencia +
                '}';
    }
}
