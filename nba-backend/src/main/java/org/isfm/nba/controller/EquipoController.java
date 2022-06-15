package org.isfm.nba.controller;

import org.iesfm.nba.Equipo;
import org.isfm.nba.dao.EquipoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EquipoController {

    @Autowired
    private EquipoDao equipoDao;

    @RequestMapping(method = RequestMethod.GET, path = "/equipos/{nombre_equipo}")
    public Equipo getEquipo(@PathVariable (name = "nombre_equipo") String equipo){
        return equipoDao.getEquipo(equipo);
    }


}
