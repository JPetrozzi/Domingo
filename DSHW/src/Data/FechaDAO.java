package Data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Fecha;

public class FechaDAO {

	public void create(Fecha f) {
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "INSERT INTO fechas (descripcion,idtorneo) VALUES (?,?)";
		try  {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, f.getDescripcion());
			ps.setLong(2, f.getTorneo().getId());
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
	
	public void delete(Fecha f) {
		
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "DELETE FROM fechas WHERE idfecha = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, f.getId());
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
	
	public void update(Fecha f) {
		
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "UPDATE fechas SET descripcion = ?, idtorneo = ? WHERE idfecha = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, f.getDescripcion());
			ps.setLong(2, f.getTorneo().getId());
			ps.setLong(3, f.getId());
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
