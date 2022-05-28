package org.isfm.nba.controller;

import org.isfm.nba.dao.EquipoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipoController {

    @Autowired
    private EquipoDao equipoDao;


}
