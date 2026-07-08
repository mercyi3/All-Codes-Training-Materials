package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","0123");
			Statement st=con.createStatement();
			st.executeUpdate("create database Demo");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
