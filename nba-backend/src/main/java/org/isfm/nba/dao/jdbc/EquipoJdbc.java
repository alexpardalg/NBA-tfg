package org.isfm.nba.dao.jdbc;

import org.isfm.nba.dao.EquipoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EquipoJdbc implements EquipoDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;
}
