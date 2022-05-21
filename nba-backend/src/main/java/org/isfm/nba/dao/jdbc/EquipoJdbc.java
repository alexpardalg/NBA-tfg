package org.isfm.nba.dao.jdbc;

import org.isfm.nba.dao.EquipoDao;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EquipoJdbc implements EquipoDao {

    private NamedParameterJdbcTemplate jdbc;
}
