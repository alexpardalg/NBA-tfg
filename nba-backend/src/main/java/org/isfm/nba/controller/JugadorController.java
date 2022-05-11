package org.isfm.nba.controller;

import org.isfm.nba.dao.JugadorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController {

    @Autowired
    private JugadorDao jugadorDao;


}
