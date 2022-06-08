package org.isfm.nba.dao.jdbc;

import org.iesfm.nba.Jugador;
import org.isfm.nba.dao.JugadorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JugadorJdbc implements JugadorDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    private final static String SELECT_JUGADORES = "SELECT * FROM jugador WHERE posicion= :posicion";
    private final static String DELETE_JUGADOR = "DELETE FROM jugador WHERE posicion= :posicion";

    @Override
    public List<Jugador> listAll() {
        Map<String, Object> params = new HashMap<>();

        return jdbc.query(
                SELECT_JUGADORES,
                ((rs, rowNum) ->
                        new Jugador(
                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getString("apellido"),
                                rs.getString("posicion"),
                                rs.getString("equipo"),
                                rs.getString("conferencia")
                        ))
        );
    }

    @Override
    public List<Jugador> findByPosicion(String posicion) {
        return null;
    }

    @Override
    public List<String> findPosiciones() {
        // SELECT DISTINCT posicion FROM jugadores
        return null;
    }
}
