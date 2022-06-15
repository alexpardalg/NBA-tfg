package org.isfm.nba.dao.jdbc;

import org.iesfm.nba.Equipo;
import org.isfm.nba.dao.EquipoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Component
public class EquipoJdbc implements EquipoDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    private final static String SELECT_EQUIPO_BYNOMBRE = "SELECT nombre FROM equipo";
    private final static String SELECT_EQUIPO = "SELECT * FROM equipo";

    private final static RowMapper<Equipo> EQUIPO_ROW_MAPPER= (rs, rowNum) ->
            new Equipo(
                    rs.getString("nombre"),
                    rs.getString("nombre_equipo")
            );

    @Override
    public Equipo getEquipo(String equipo) {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("nombre", equipo);
            return jdbc.queryForObject(SELECT_EQUIPO_BYNOMBRE, params, ((rs, rowNum) -> new Equipo(
                    rs.getString("nombre"),
                    rs.getString("nombre_conferencia")
            )));
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}
