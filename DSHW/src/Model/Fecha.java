package Model;

import Data.DAOFactory;
import Utilities.DSHMensaje;

public class Fecha extends BaseBO {

	private String descripcion;
	private Torneo torneo;
	
	public Fecha() {
		super();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}
	
	//	Metodos para ABM
	public Fecha create() {
		
		int result = DAOFactory.getFechaDAO().create(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Fecha creada correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al crear la fecha."));
		return this;
	}
	
	public Fecha delete() {
		
		int result = DAOFactory.getFechaDAO().delete(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Fecha eliminada correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al eliminar la fecha."));
		return this;
	}
	
	public Fecha update() {
		
		int result = DAOFactory.getFechaDAO().update(this);
		if (result > 0)
			this.setMensaje(new DSHMensaje("mensajeOK", "¡Fecha modificada correctamente!"));
		else 
			this.setMensaje(new DSHMensaje("mensajeError", "Ocurrio un error al modificar la fecha."));
		return this;
	}
}
