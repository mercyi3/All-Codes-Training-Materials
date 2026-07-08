package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTable {

	public static void main(String[] args) 
	{
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Developers","root","0123");
			Statement st=con.createStatement();
			String sql = "CREATE TABLE details ("
                    + "id INT NOT NULL, "
                    + "name VARCHAR(20) NOT NULL, "
                    + "age INT, "
                    + "PRIMARY KEY(id))";
			
			st.executeUpdate(sql);
			System.out.println("table Created");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

}
