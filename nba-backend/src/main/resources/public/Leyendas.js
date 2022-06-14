function loadTablajugadores(){
    $.get("/posiciones", function(posiciones){
        let  posicionesTable = $("#posiciones");
        for(posicion of posiciones) {
            let posicionTr = $("<tr>");
            let posicionTd= $("<td>").text(posicion);
            let jugadoresTd = $("<td>");

            posicionTr.append(posicionTd);
            posicionTr.append(jugadoresTd);
            posicionesTable.append(posicionTr);
             let params = {
                            "posicion": posicion
                        };
             $.get("/jugadores", params, function(jugadores) {
                    $.get("/jugadores"), function(jugadores){
                        let equipo =
                    }
                    for(jugador of jugadores){
                        let jugadorP = $("<p>").text(jugador.nombre + " " + jugador.apellido);
                            jugadoresTd.append(jugadorP);
                    }
                });
        }
    });

}