package Data;

public class DAOFactory {

	private static PersonaDAO personaDAO = new PersonaDAO();
	private static TorneoDAO torneoDAO = new TorneoDAO();
	private static FechaDAO fechaDAO = new FechaDAO();
	private static PartidoDAO partidoDAO = new PartidoDAO();
	private static EquipoDAO equipoDAO = new EquipoDAO();
	
	public static PersonaDAO getPersonaDAO() {
		return personaDAO;
	}
	
	public static TorneoDAO getTorneoDAO() {
		return torneoDAO;
	}
	
	public static FechaDAO getFechaDAO() {
		return fechaDAO;
	}
	
	public static PartidoDAO getPartidoDAO() {
		return partidoDAO;
	}
	
	public static EquipoDAO getEquipoDAO() {
		return equipoDAO;
	}
}
