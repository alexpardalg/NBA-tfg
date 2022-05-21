package org.isfm.nba.controller;

import org.isfm.nba.dao.ConferenciaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConferenciaController {

    @Autowired
    private ConferenciaDao conferenciaDao;
}
