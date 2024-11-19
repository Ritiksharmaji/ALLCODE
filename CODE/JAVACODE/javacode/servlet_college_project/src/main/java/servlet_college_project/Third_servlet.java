package servlet_college_project;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Third_servlet extends HttpServlet
{
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {            
            ServletConfig config = getServletConfig();
            String a = config.getInitParameter("username");
            String b = config.getInitParameter("password");
             if(user.equals(a) && pass.equals(pass))
             {
        	out.println("Login Successful......... Welcome "+user);
            RequestDispatcher rs = request.getRequestDispatcher("/welcome.html");
            rs.include(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("/index.html");
           rs.include(request, response);
        }
        }
    }
}
    

