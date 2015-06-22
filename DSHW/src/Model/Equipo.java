package Model;

public class Equipo extends BaseBO {

	private String nombre;
	private Integer puntos;
	private Integer partidosJugados;
	private Integer golesAFavor;
	private Integer golesEnContra;
	private Integer golesTotales;
	
	public Equipo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Integer getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(Integer partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public Integer getGolesAFavor() {
		return golesAFavor;
	}

	public void setGolesAFavor(Integer golesAFavor) {
		this.golesAFavor = golesAFavor;
	}

	public Integer getGolesEnContra() {
		return golesEnContra;
	}

	public void setGolesEnContra(Integer golesEnContra) {
		this.golesEnContra = golesEnContra;
	}

	public Integer getGolesTotales() {
		return golesTotales;
	}

	public void setGolesTotales(Integer golesTotales) {
		this.golesTotales = golesTotales;
	}
}
