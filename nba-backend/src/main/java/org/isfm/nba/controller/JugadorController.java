package org.isfm.nba.controller;

import org.iesfm.nba.Jugador;
import org.isfm.nba.dao.JugadorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class JugadorController {

    @Autowired
    private JugadorDao jugadorDao;

    @RequestMapping(method = RequestMethod.GET, path = "/conferencias/equipos/jugadores/{posicion}")
    public List<Jugador> getJugador(@RequestParam(name = "posicion") String posicion){

        if (posicion != null){
            return jugadorDao.listAll();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

//    @RequestMapping(method = RequestMethod.DELETE, path = "/conferencias/equipos/jugadores/{posicion}")
//    public void borrarJugador(@RequestParam)
}
