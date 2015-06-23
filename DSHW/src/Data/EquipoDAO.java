package Data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Equipo;

public class EquipoDAO {

	public int create(Equipo e) {
		
		int result = 0;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "INSERT INTO equipos (nombre,puntos,partidosjugados,golesafavor,golesencontra,golestotales) VALUES (?,?,?,?,?,?)";
		try  {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, e.getNombre());
			ps.setInt(2, e.getPuntos());
			ps.setInt(3, e.getPartidosJugados());
			ps.setInt(4, e.getGolesAFavor());
			ps.setInt(5, e.getGolesEnContra());
			ps.setInt(6, e.getGolesTotales());
			result = ps.executeUpdate();
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				con.getConnection().close();
				ps.close();
			} 
			catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
	public int delete(Equipo e) {
		
		int result = 0;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "DELETE FROM equipos WHERE idequipo = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, e.getId());
			result = ps.executeUpdate();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				con.getConnection().close();
				ps.close();
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
	public int update(Equipo e) {
		
		int result = 0;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "UPDATE partidos SET nombre = ?, putos = ?, partidosjugados = ?, golesafavor = ?, golesencontra = ?, golestotales = ? WHERE idequipo = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, e.getNombre());
			ps.setInt(2, e.getPuntos());
			ps.setInt(3, e.getPartidosJugados());
			ps.setInt(4, e.getGolesAFavor());
			ps.setInt(5, e.getGolesEnContra());
			ps.setInt(6, e.getGolesTotales());
			ps.setLong(7, e.getId());
			result = ps.executeUpdate();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				con.getConnection().close();
				ps.close();
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}
