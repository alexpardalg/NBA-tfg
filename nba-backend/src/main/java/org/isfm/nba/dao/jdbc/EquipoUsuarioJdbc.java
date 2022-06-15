package org.isfm.nba.dao.jdbc;

import org.iesfm.nba.EquipoUsuario;
import org.isfm.nba.dao.EquipoUsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EquipoUsuarioJdbc implements EquipoUsuarioDAO {

    private final static String INSERT_EQUIPOUSUARIO = "INSERT INTO equipo_usuario(nombre) VALUES (:nombre)";
    private final static String INSERT_JUGADORES_EQUIPOUSUARIO = "INSERT INTO jugador_equipo_usuario(nombre, id_jugador) VALUES (:nombre, :idJugador)";

    @Autowired
    public NamedParameterJdbcTemplate jdbc;

    @Override
    public void insertEquipo(EquipoUsuario equipoUsuario){
        Map<String, Object> params = new HashMap<>();
        params.put("nombre", equipoUsuario.getNombre());
        jdbc.update(INSERT_EQUIPOUSUARIO, params);

        for (int idJugadr: equipoUsuario.getIdsJugadores()){
            Map<String, Object> jugadoParams = new HashMap<>();
            jugadoParams.put("nombre", equipoUsuario.getNombre());
            jugadoParams.put("idJugador", idJugadr);
            jdbc.update(INSERT_JUGADORES_EQUIPOUSUARIO, jugadoParams);
        }

    }
}
