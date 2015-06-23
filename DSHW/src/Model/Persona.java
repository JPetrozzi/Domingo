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
	private Integer esAdmin;  // 0 ---> FALSE   -   1 ---> TRUE
	

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
	
	public Integer getEsAdmin() {
		return esAdmin;
	}

	public void setEsAdmin(Integer esAdmin) {
		this.esAdmin = esAdmin;
	}
	
	//	Metodos para ABM
	public Persona create() {
		
		if (DAOFactory.getPersonaDAO().isUserValid(user)) {
			int result = DAOFactory.getPersonaDAO().create(this);
			if (result > 0)
				this.setMensaje(new DSHMensaje("mensajeOK", "¡Usuario registrado correctamente!"));
			else 
				this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al crear la cuenta."));
		} else {
			this.setMensaje(new DSHMensaje("mensajeError", "El usuario ingresado ya se encuentra en uso."));
		}
		return this;
	}
	
	public Persona delete() {
		
		int result = DAOFactory.getPersonaDAO().delete(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Usuario eliminado correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al eliminar la cuenta."));
		return this;
	}
	
	public Persona update() {
		
		int result = DAOFactory.getPersonaDAO().update(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Usuario modificado correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al modificar la cuenta."));
		return this;
	}
}
