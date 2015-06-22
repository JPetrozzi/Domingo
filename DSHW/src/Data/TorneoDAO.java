package Data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Torneo;

public class TorneoDAO {

	public void create(Torneo t) {
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "INSERT INTO torneos (descripcion) VALUES (?)";
		try  {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, t.getDescripcion());
			ps.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.getConnection().close();
				ps.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(Torneo t) {
		
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "DELETE FROM torneos WHERE idtorneo = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, t.getId());
			ps.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.getConnection().close();
				ps.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Torneo t) {
		
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "UPDATE torneos SET descripcion = ? WHERE idtorneo = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, t.getDescripcion());
			ps.setLong(2, t.getId());
			ps.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.getConnection().close();
				ps.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
