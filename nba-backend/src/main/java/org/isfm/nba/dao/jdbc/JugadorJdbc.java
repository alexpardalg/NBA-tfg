package org.isfm.nba.dao.jdbc;

import org.iesfm.nba.Jugador;
import org.isfm.nba.dao.JugadorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JugadorJdbc implements JugadorDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    private final static String SELECT_JUGADORES = "SELECT * FROM jugador";
    private final static String SELECT_JUGADORES_BYPOSICION = "SELECT * FROM jugador WHERE posicion= :posicion";
    private final static String SELECT_POSICION = "SELECT DISTINCT posicion FROM jugador";
    private final static String SELECT_JUGADORES_BYTEAM = "SELECT * FROM jugador WHERE equipo= :nombre_equipo";


    private final static RowMapper<Jugador> JUGADOR_ROW_MAPPER = ((rs, rowNum) ->
            new Jugador(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellidos"),
                    rs.getString("posicion"),
                    rs.getString("nombre_equipo"),
                    rs.getString("conferencia")
            ));

    @Override
    public List<Jugador> listAll() {
        Map<String, Object> params = new HashMap<>();

        return jdbc.query(
                SELECT_JUGADORES,
                JUGADOR_ROW_MAPPER
        );
    }

    @Override
    public List<Jugador> findByPosicion(String posicion) {

        Map<String, Object> params = new HashMap<>();
        params.put("posicion", posicion);
        return jdbc.query(
                SELECT_JUGADORES_BYPOSICION,
                params,
                JUGADOR_ROW_MAPPER
        );
    }

    @Override
    public List<String> findPosiciones() {
        return jdbc.query(SELECT_POSICION,
                ((rs, rowNum) ->
                        rs.getString("posicion")
                )
        );
    }

//    @Override
//    public List<Jugador> listJugadoresByTeam(String equipo) {
//        Map<String, Object> params = new HashMap<>();
//        params.put("equipo", equipo);
//
//        return jdbc.query(SELECT_JUGADORES_BYTEAM,
//                params,
//                JUGADOR_ROW_MAPPER);
//    }
}
