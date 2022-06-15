package org.isfm.nba.controller;

import org.iesfm.nba.EquipoUsuario;
import org.isfm.nba.dao.EquipoUsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipoUsuarioController {

    @Autowired
    private EquipoUsuarioDAO equipoUsuarioDAO;

    @RequestMapping(method = RequestMethod.POST, path = "/equipoUsuarios")
    public void añadirEquipo(@RequestBody EquipoUsuario equipoUsuario) {
        equipoUsuarioDAO.insertEquipo(equipoUsuario);
    }
}
