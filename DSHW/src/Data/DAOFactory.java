package Data;

public class DAOFactory {

	private static PersonaDAO personaDAO = new PersonaDAO();
	
	public static PersonaDAO getPersonaDAO() {
		return personaDAO;
	}
}
