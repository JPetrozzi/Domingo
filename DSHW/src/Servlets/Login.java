package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.DAOFactory;
import Model.Persona;
import Utilities.StringUtil;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public HttpSession session;

    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
		String pass = StringUtil.encryptText(request.getParameter("pass"));
		
		Persona p = DAOFactory.getPersonaDAO().validarLogin(user, pass);
		
		session = request.getSession(true);
		
		if (p != null) {
			response.sendRedirect("test.jsp");
		} else {
			session.setAttribute("mensajeError", "El usuario o la contraseña ingresada son incorrectos.");
			response.sendRedirect("index.jsp");
		}
	}

}
