package org.isfm.nba.controller.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class JugadorRest {

    private int id;
    private String nombre;
    private String apellido;
    private String posicion;
    private String equipo;
    private String conferencia;

    @JsonCreator
    public JugadorRest(@JsonProperty(value = "id") int id,
                       @JsonProperty(value = "nombre") String nombre,
                       @JsonProperty(value = "apellido") String apellido,
                       @JsonProperty(value = "posicion") String posicion,
                       @JsonProperty(value = "nombre_equipo") String equipo,
                       @JsonProperty(value = "conferencia") String conferencia) {
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
        JugadorRest that = (JugadorRest) o;
        return id == that.id &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(posicion, that.posicion) &&
                Objects.equals(equipo, that.equipo) &&
                Objects.equals(conferencia, that.conferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, posicion, equipo, conferencia);
    }

    @Override
    public String toString() {
        return "JugadorRest{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                ", conferencia='" + conferencia + '\'' +
                '}';
    }
}
