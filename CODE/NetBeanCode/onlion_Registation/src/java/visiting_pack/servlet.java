/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package visiting_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author RITIK SHARMA
 */
public class servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
       
            
           // geting all the  requrment request from the jsp
           
           String name=request.getParameter("user_name");
           String password=request.getParameter("user_pass");
           String email=request.getParameter("user_email");   
            
            // creating the connection ........
            if(name!=null && password!=null && email!=null)
            {
             try{
                 Thread.sleep(2000);
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/full_stack_developer","root","Ritiksharma620@");  
  
PreparedStatement ps=con.prepareStatement(  "insert into visiting values(?,?,?)");  
  
ps.setString(1,name);  
ps.setString(2,password);  
ps.setString(3,email);   
          
int i=ps.executeUpdate();  
if(i>0)  
{
out.print("done");
//request.getRequestDispatcher("Signup.jsp").include(request, response);  
     out.close();   
}
          
}catch (Exception e2) {System.out.println(e2);
out.println("error");}  
          
 
            
      
            
           
        }
            else {
    out.println("error");
}
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
