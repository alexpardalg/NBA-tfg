package org.isfm.nba.controller;

import jdk.jfr.Registered;
import org.isfm.nba.controller.api.EquipoApi;
import org.isfm.nba.dao.EquipoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipoController implements EquipoApi {

    @Autowired
    private EquipoDao equipoDao;


}
