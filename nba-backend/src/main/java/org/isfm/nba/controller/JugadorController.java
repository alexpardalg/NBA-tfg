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

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class JugadorController {

    @Autowired
    private JugadorDao jugadorDao;


    @RequestMapping(method = RequestMethod.GET, path = "/posiciones")
    public List<String> getPosiciones(){
        return jugadorDao.findPosiciones();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/jugadores")
    public List<Jugador> getJugador(@RequestParam(name = "posicion") String posicion){

        if (posicion == null){
            return jugadorDao.listAll();
        }else{
            return jugadorDao.findByPosicion(posicion);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/jugadores/{id}")
    public void borrarJugador(@PathParam("id") String jugadorId){

//        if (jugadorDao.removeJugador(posicion) == 0){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
    }
}
