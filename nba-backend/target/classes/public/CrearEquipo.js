function newContact() {
	var nameInput=document.getElementById('name');
	var surnameInput=document.getElementById('surname');
	var concatJson={name: nameInput.value, surname: surnameInput.value};
	addContact(concatJson);
}

function addContact(contact) {
	// Se selecciona la tabla que vamos a modificar.
	var contactsTable = document.getElementById("contacts");

	// Se crea el td con el nombre
	var nameTd=document.createElement("td");
	nameTd.appendChild(document.createTextNode(contact.name));

	// Se crea el td con el apellido
	var surnameTd=document.createElement("td");
	surnameTd.appendChild(document.createTextNode(contact.surname));
	
	// Se crea el tr con el td del nombre y el del telefono
	var contactTr=document.createElement("tr");
	contactTr.appendChild(nameTd); 
	contactTr.appendChild(surnameTd);

	// Se añade el tr a la tabla
	contactsTable.appendChild(contactTr);
}

function loadJugadores() {
    $.get("/posiciones", funcion(posiciones){
        let posicionesDiv = $("#posiciones");
        for(posicion of posiciones) {
            let posicionDiv = $("<div>");

            let jugadoresSelect = $("<select>");
            posicionesDiv.append(jugadoresSelect);
            // Crear un DIV para bases
            let params = {
                "posicion": posicion
            };
            $.get("/jugadores", params, function(jugadores) {
                for(jugador of jugadores){
                    // AÑADIR EL JUDADOR A LA LISTA

                    var select = document.getJugadoresByPosicion('posiciones')
                    var text = select.options[select.selectIndex].text;
                    console.log(text);
                }
            });

            posicionesDiv.append(posicionDiv);
        }
    });
}

function loadJugadoresPosicion(posicion){
        let posicionDiv = $("#"+posicion);
        $.get("/jugadores")
}