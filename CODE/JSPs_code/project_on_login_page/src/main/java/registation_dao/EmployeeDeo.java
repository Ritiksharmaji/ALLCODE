package registation_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import registation_mode.*;

public class EmployeeDeo {
	

	public int registerEmployee(Employee employee)throws ClassNotFoundException
	{
		String sql_query="insert into employee"+
	"(emp_name,age,dpt)values"+
				"(?,?,?);";
		
		int result=0;
		Class.forName("com.mysql.jdbc.Driver");
		
		try
		{
			String url="jdbc:mysql://localhost:3306/college";
			String user="root";
			String password="Ritiksharma620@";
			Connection con=DriverManager.getConnection(url, user, password);
			
			// step creating statment
			PreparedStatement stmt=con.prepareStatement(sql_query);
			
			//stmt.setInt(1, 1);
			stmt.setString(1,employee.getName());
			stmt.setString(2, employee.getName());
			stmt.setString(3,employee.getName());
			
			System.out.println(stmt);
			
			result=stmt.executeUpdate();
		}
		catch(Exception e)
		{
		//	System.out.println(e);
			e.printStackTrace();
		}
		return result;
	}

}
