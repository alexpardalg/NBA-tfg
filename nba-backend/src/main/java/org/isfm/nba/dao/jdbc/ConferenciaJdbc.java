package org.isfm.nba.dao.jdbc;

import org.isfm.nba.dao.ConferenciaDao;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ConferenciaJdbc implements ConferenciaDao {

    private NamedParameterJdbcTemplate jdbc;
}
