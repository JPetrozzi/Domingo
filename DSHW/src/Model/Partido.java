package Model;

import java.util.Date;

public class Partido extends BaseBO {

	private Equipo local;
	private Equipo visitante;
	private Integer golesLocal;
	private Integer golesVisitante;
	private Fecha fechaTorneo;
	private Date fecha;
	
	public Partido() {
		super();
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public Integer getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(Integer golesLocal) {
		this.golesLocal = golesLocal;
	}

	public Integer getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Fecha getFechaTorneo() {
		return fechaTorneo;
	}

	public void setFechaTorneo(Fecha fechaTorneo) {
		this.fechaTorneo = fechaTorneo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
