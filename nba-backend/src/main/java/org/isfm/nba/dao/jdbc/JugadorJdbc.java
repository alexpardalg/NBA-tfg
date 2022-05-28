package org.isfm.nba.dao.jdbc;

import org.iesfm.nba.Jugador;
import org.isfm.nba.dao.JugadorDao;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JugadorJdbc implements JugadorDao {

    private NamedParameterJdbcTemplate jdbc;

    private final static String SELECT_JUGADORES = "SELECT * FROM jugador";

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
}
