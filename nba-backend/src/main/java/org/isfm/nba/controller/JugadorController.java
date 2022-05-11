package org.isfm.nba.controller;

import org.isfm.nba.controller.api.JugadorApi;
import org.isfm.nba.dao.JugadorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController implements JugadorApi {

    @Autowired
    private JugadorDao jugadorDao;


}
