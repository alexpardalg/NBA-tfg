function loadJugadores() {
    $.get("/posiciones", function(posiciones){
        let posicionesDiv = $("#posiciones");
        for(posicion of posiciones) {
            let posicionDiv = $("<div>");

            let jugadoresSelect = $("<select>");
            posicionesDiv.append(posicion);
            posicionesDiv.append(jugadoresSelect);
            // Crear un DIV para bases
            let params = {
                "posicion": posicion
            };
            $.get("/jugadores", params, function(jugadores) {
                for(jugador of jugadores){
                    let jugadorOpttion = $("<option>", {
                        "value": jugador.id
                    }).text(jugador.nombre + " " + jugador.apellido);
                    jugadoresSelect.append(jugadorOpttion);
                }
            });

            posicionesDiv.append(posicionDiv);
        }
    });
}

//function loadEquipos(){
//    $.post("/equipo"), equipoJSON, function(equipo)
//}