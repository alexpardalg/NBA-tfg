function newContact() {
	var nameInput=document.getElementById('name');
	var phoneInput=document.getElementById('phone');
	var concatJson={name: nameInput.value, phone: phoneInput.value};
	addContact(concatJson);
}

function addContact(contact) {
	// Se selecciona la tabla que vamos a modificar.
	var contactsTable = document.getElementById("contacts");

	// Se crea el td con el nombre
	var nameTd=document.createElement("td");
	nameTd.appendChild(document.createTextNode(contact.name));

	// Se crea el td con el teléfono
	var phoneTd=document.createElement("td");
	phoneTd.appendChild(document.createTextNode(contact.phone)); 
	
	// Se crea el tr con el td del nombre y el del telefono
	var contactTr=document.createElement("tr");
	contactTr.appendChild(nameTd); 
	contactTr.appendChild(phoneTd); 

	// Se añade el tr a la tabla
	contactsTable.appendChild(contactTr);
}