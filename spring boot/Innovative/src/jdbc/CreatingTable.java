package jdbc;

import java.sql.*;

public class CreatingTable 
{
	public static void main(String[] args) {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/academy","root","0123");
			Statement st=con.createStatement();
			
//			String sql = "CREATE TABLE student (id INT NOT NULL,"
//					+ "name VARCHAR(20) NOT NULL, age INT, PRIMARY KEY(id))";
			
			st.executeUpdate("drop table demo");
			System.out.println("table Created");
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}	
	}
}