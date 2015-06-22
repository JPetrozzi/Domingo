package Model;

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
}
