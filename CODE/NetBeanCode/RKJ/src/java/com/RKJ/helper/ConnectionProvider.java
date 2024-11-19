/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RKJ.helper;
import java.sql.*;
/**
 *
 * @author RITIK SHARMA
 */
public class ConnectionProvider {
    
    private static Connection con;
    
    public static Connection getConnection()
    {
        try{
            
            if(con==null)
            {
                
          
            // loding the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // creating the connection
            String url="jdbc:mysql://localhost:3306/rkj";
            String use="root";
            String password="Ritiksharma620@";
            
            con=DriverManager.getConnection(url,use,password);
            
            }
            
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
        return con;
        
        }
    
}
