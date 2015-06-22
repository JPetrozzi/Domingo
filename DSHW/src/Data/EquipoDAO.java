package Data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Equipo;

public class EquipoDAO {

	public void create(Equipo e) {
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
			ps.executeUpdate();
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
	}
	
	public void delete(Equipo e) {
		
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "DELETE FROM equipos WHERE idequipo = ?;";
		try {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setLong(1, e.getId());
			ps.execute();
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
	}
	
	public void update(Equipo e) {
		
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
			ps.execute();
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
	}
}
