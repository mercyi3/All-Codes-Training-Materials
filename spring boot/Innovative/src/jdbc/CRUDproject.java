package jdbc;

import java.sql.*;
import java.util.Scanner;

public class CRUDproject 
{
	static Scanner sc = new Scanner(System.in);
	static void inserting() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/academy","root","0123");
			
			System.out.println("Enter your ID: ");
			int id = sc.nextInt();
			System.out.println("Enter your Name: ");
			String name = sc.next();
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			
			String sql = "insert into student(id, name, age) values(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3, age);
			
			st.executeUpdate();
			System.out.println("inserted data into table");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void reading() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/academy","root","0123");
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery("select * from student;");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3));
			}	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void updating() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/academy","root","0123");
			
			System.out.println("Enter age that you want to change");
			int age= sc.nextInt();
			System.out.println("Enter id to fetch data:");
			int id = sc.nextInt();
			
			String sql = "update student set age=? where id=?;";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, age);
			st.setInt(2, id);
			
			st.executeUpdate();
			System.out.println("Updated data into table");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void deleting() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/academy","root","0123");
			
			System.out.println("Enter id to delete data:");
			int id = sc.nextInt();
			
			String sql = "delete from student where id=?;";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			
			st.executeUpdate();
			System.out.println("Deleted data from table");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("1. Insert \n2. Read \n3. Update \n4. Delete \n5.exit");
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your Option: ");
			int op = sc.nextInt();
		
		switch(op)
		{
			case 1:
				inserting();
				break;
			case 2:
				reading();
				break;
			case 3: 
				updating();
				break;
			case 4:
				deleting();
				break;
			case 5:
				System.exit(0); //break
			default:
				System.out.println("Invalid Option...");
		}	
		}while(true);
	}
}
