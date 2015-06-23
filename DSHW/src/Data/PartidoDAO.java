package Data;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Partido;

public class PartidoDAO {

	public int create(Partido p) {
		
		int result = 0;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "INSERT INTO partidos (idlocal,idvisitante,goleslocal,golesvisitante,idfechatorneo,fecha) VALUES (?,?,?,?,?,?)";
		try  {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, p.getLocal().getId());
			ps.setLong(2, p.getVisitante().getId());
			ps.setInt(3, p.getGolesLocal());
			ps.setInt(4, p.getGolesVisitante());
			ps.setLong(5, p.getFechaTorneo().getId());
			ps.setDate(6, (Date)p.getFecha());
			result = ps.executeUpdate();
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
		return result;
	}
	
	public int delete(Partido p) {
		
		int result = 0;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "DELETE FROM partidos WHERE idpartido = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, p.getId());
			result = ps.executeUpdate();
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
		return result;
	}
	
	public int update(Partido p) {
		
		int result = 0;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "UPDATE partidos SET idlocal = ?, idvisitante = ?, goleslocal = ?, golesvisitante = ?, idfechatorneo = ?, fecha = ? WHERE idpartido = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, p.getLocal().getId());
			ps.setLong(2, p.getVisitante().getId());
			ps.setInt(3, p.getGolesLocal());
			ps.setInt(4, p.getGolesVisitante());
			ps.setLong(5, p.getFechaTorneo().getId());
			ps.setDate(6, (Date)p.getFecha());
			ps.setLong(7, p.getId());
			result = ps.executeUpdate();
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
		return result;
	}
}
