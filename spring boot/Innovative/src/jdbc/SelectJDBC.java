package jdbc;
import java.sql.*;

public class SelectJDBC 
{
  public static void main(String[] args) 
  {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/innovative","root","0123");
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
}
