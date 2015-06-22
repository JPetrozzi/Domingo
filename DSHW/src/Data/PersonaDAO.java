package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Persona;

public class PersonaDAO {

	public Persona validarLogin(String user, String pass) {
		
		Persona pers = null;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String queryString = "SELECT * FROM personas WHERE user = ? AND password = ?;";
		try 
		{
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if(rs.next())
			{
				pers = new Persona();
				pers.setId(rs.getLong("idpersona"));
				pers.setUser(rs.getString("user"));
				pers.setPassword(rs.getString("password"));
				pers.setNombre(rs.getString("nombre"));
				pers.setEmail(rs.getString("email"));
				pers.setApellido(rs.getString("apellido"));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				con.getConnection().close();
				ps.close();
				rs.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return pers;
	}
	
	public boolean isUserValid(String user) {
		
		boolean isValid = false;
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String queryString = "SELECT * FROM personas WHERE user = ?;";
		try 
		{
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, user);
			rs = ps.executeQuery();
			if(rs.next())
			{
				isValid = false;
			}
			else
			{
				isValid = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				con.getConnection().close();
				ps.close();
				rs.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return isValid;
	}
	
	public void create(Persona p) {
		ConnectionDB con = new ConnectionDB();
		PreparedStatement ps = null;
		String queryString = "INSERT INTO personas (user,password,nombre,apellido,email) VALUES (?,?,?,?,?)";
		try  {
			ps = con.getConnection().prepareStatement(queryString);
			ps.setString(1, p.getUser());
			ps.setString(2, p.getPassword());
			ps.setString(3, p.getNombre());
			ps.setString(4, p.getApellido());
			ps.setString(5, p.getEmail());
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
	
//	public ArrayList<Usuario> getAll()
//	{
//		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//		Usuario u;
//		ConeccionDB con = new ConeccionDB();
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		String queryString = "SELECT * FROM usuarios ORDER BY username;";
//		try
//		{
//			ps = con.getConnection().prepareStatement(queryString);
//			rs = ps.executeQuery();
//			while(rs.next())
//			{
//				u = new Usuario();
//				u.setId(rs.getInt("id_usuario"));
//				u.setUsername(rs.getString("username"));
//				u.setPassword(rs.getString("password"));
//				u.setRol(rs.getString("tipo_usuario"));
//				u.setNombre(rs.getString("nombre"));
//				u.setEmail(rs.getString("email"));
//				usuarios.add(u);
//			}
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				con.getConnection().close();
//				rs.close();
//				ps.close();
//			}
//			catch(SQLException e)
//			{
//				e.printStackTrace();
//			}
//		}
//		return usuarios;
//	}
//	
//	public Usuario getOne(int id)
//	{
//		Usuario u = null;
//		ConeccionDB con = new ConeccionDB();
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		String queryString = "SELECT * FROM usuarios WHERE id_usuario = ?;";
//		try
//		{
//			ps = con.getConnection().prepareStatement(queryString);
//			ps.setInt(1, id);
//			rs = ps.executeQuery();
//			while(rs.next())
//			{
//				u = new Usuario();
//				u.setId(rs.getInt("id_usuario"));
//				u.setUsername(rs.getString("username"));
//				u.setPassword(rs.getString("password"));
//				u.setRol(rs.getString("tipo_usuario"));
//				u.setNombre(rs.getString("nombre"));
//				u.setEmail(rs.getString("email"));
//			}
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				con.getConnection().close();
//				rs.close();
//				ps.close();
//			}
//			catch(SQLException e)
//			{
//				e.printStackTrace();
//			}
//		}
//		return u;
//	}
//	
//	public void eliminarUsuario(int id)
//	{
//		ConeccionDB con = new ConeccionDB();
//		PreparedStatement ps = null;
//		String queryString = "DELETE FROM usuarios WHERE id_usuario = ?;";
//		try
//		{
//			ps = con.getConnection().prepareStatement(queryString);
//			ps.setInt(1, id);
//			ps.execute();
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				con.getConnection().close();
//				ps.close();
//			}
//			catch(SQLException e)
//			{
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public void editarUsuario(Usuario u)
//	{
//		ConeccionDB con = new ConeccionDB();
//		PreparedStatement ps = null;
//		String queryString = "UPDATE usuarios SET username = ?, password = ?, tipo_usuario = ?, nombre = ?, email = ? WHERE id_usuario = ?;";
//		try
//		{
//			ps = con.getConnection().prepareStatement(queryString);
//			ps.setString(1, u.getUsername());
//			ps.setString(2, u.getPassword());
//			ps.setString(3, u.getRol());
//			ps.setString(4, u.getNombre());
//			ps.setString(5, u.getEmail());
//			ps.setInt(6, u.getId());
//			ps.execute();
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				con.getConnection().close();
//				ps.close();
//			}
//			catch(SQLException e)
//			{
//				e.printStackTrace();
//			}
//		}
//	}
}
