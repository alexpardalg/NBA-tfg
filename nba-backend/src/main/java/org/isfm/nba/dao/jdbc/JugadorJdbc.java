package org.isfm.nba.dao.jdbc;

import org.isfm.nba.dao.JugadorDao;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JugadorJdbc implements JugadorDao {

    private NamedParameterJdbcTemplate jdbc;
}
