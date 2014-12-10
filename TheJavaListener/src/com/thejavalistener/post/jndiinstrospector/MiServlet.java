package com.thejavalistener.post.jndiinstrospector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/miServlet")
public class MiServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{		
		try
		{
			// muestro el contenido del JNDI (ver por consola)
			JndiInstrospector.print();
			
			// ahora hago el lookup del EJB
			Context ctx = new InitialContext();
			MiEJB ejb = (MiEJB) ctx.lookup("java:/app/TheJavaListener/MiEJB");
			
			// invoco al metodo saludar
			PrintWriter out = response.getWriter();
			out.print( ejb.saludar("Pablo") );
			
			out.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		
		
	}
}
