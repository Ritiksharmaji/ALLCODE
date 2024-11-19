package servlet_college_project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second_servlet
 */
@WebServlet("/Second_servlet")
public class Second_servlet extends HttpServlet
{
	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
   	                  response.setContentType("text/html;charset=UTF-8");
   	                   try (PrintWriter out = response.getWriter()) 
   	                  {
   	                       
   	                	   out.println("Welcome to Servlet");
   	                  }
   	                   catch(Exception e)
   	                   {
   	                	  System.out.println(e); 
   	                   }
   	        }

}
