package Model;

import Data.DAOFactory;
import Utilities.DSHMensaje;

public class Torneo extends BaseBO {

	private String descripcion;
	
	public Torneo() {
		super();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//	Metodos para ABM
	public Torneo create() {
		
		int result = DAOFactory.getTorneoDAO().create(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Torneo creado correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al crear el torneo."));
		return this;
	}
	
	public Torneo delete() {
		
		int result = DAOFactory.getTorneoDAO().delete(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Torneo eliminado correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al eliminar el torneo."));
		return this;
	}
	
	public Torneo update() {
		
		int result = DAOFactory.getTorneoDAO().update(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Torneo modificado correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al modificar el torneo."));
		return this;
	}
}
