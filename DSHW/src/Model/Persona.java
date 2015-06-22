package Model;

import Data.DAOFactory;
import Utilities.DSHMensaje;
import Utilities.StringUtil;

public class Persona extends BaseBO {

	private String	user;
	private String 	password;
	private String 	nombre;
	private String 	apellido;
	private String	email;
	
	public Persona(){
		super();
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
		this.password = StringUtil.encryptText(password);
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
}
