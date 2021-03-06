package org.isfm.nba.dao;

import org.iesfm.nba.Jugador;
import org.springframework.stereotype.Component;

import java.util.List;

public interface JugadorDao {

    List<Jugador> listAll();

    List<Jugador> findByPosicion(String posicion);


    List<String> findPosiciones();

    List<Jugador> listJugadoresByTeam(String equipo);

    List<Jugador> listJugadoresByTeamAndPosicion(String equipo, String posicion);
}
