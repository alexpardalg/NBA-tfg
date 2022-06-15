package org.isfm.nba.controller;

import org.iesfm.nba.Jugador;
import org.isfm.nba.dao.JugadorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Objects;

@RestController
public class JugadorController {

    @Autowired
    private JugadorDao jugadorDao;


    @RequestMapping(method = RequestMethod.GET, path = "/posiciones")
    public List<String> getPosiciones(){
        return jugadorDao.findPosiciones();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/jugadores")
    public List<Jugador> getJugador(@RequestParam( required = false, name = "posicion") String posicion){

        if (posicion == null){
            return jugadorDao.listAll();
        }else{
            return jugadorDao.findByPosicion(posicion);
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/equipos/{nombre_equipo}/jugadores")
    public List<Jugador> getJugadoresByTeam(
            @PathVariable(name = "nombre_equipo") String equipo,
            @RequestParam( required = false, name = "posicion") String posicion){
        if(posicion == null) {
            return jugadorDao.listJugadoresByTeam(equipo);
        } else {
            return jugadorDao.listJugadoresByTeamAndPosicion(equipo, posicion);
        }
    }

}
