package org.isfm.nba.dao;

import org.iesfm.nba.EquipoUsuario;

import java.util.List;

public interface EquipoUsuarioDAO {
    void insertEquipo(EquipoUsuario equipoUsuario);

    List<EquipoUsuario> listAll();
}
