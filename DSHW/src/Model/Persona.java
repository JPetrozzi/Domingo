package Model;

import java.util.ArrayList;

import Data.DAOFactory;
import Utilities.DSHMensaje;

public class Persona {

	private Long 	id;
	private DSHMensaje mensaje;
	private String	user;
	private String 	password;
	private String 	nombre;
	private String 	email;
	private String	telefono;
	private String 	documento;
	
	public Persona(){
		
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public DSHMensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(DSHMensaje mensaje) {
		this.mensaje = mensaje;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	//	Metodos para ABM
	public Persona create() {
		
		if (DAOFactory.getPersonaDAO().isUserValid(user)) {
			DAOFactory.getPersonaDAO().create(this);
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Usuario registrado correctamente!"));
		} else {
			this.setMensaje(new DSHMensaje("mensajeError", "El usuario ingresado ya se encuentra en uso."));
		}
		return this;
	}
	
	// Metodos de Clase

}
