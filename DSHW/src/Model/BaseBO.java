package Model;

import Utilities.DSHMensaje;

public class BaseBO {

	private Long id;
	private DSHMensaje mensaje;
	
	public BaseBO() {
		
	}

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
}
