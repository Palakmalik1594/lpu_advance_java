package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//now lets implement how to take input from user
public class Demo2 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/college";
		String username="postgres";
		String pass="root";
		Connection con=DriverManager.getConnection(url,username,pass);
		
		int uid=6;
		String name="Dipali";
		String s="select * from life";
		// we will use preparedStatement here-we use them when query is fixed but input keeps on changing 
		String query="insert into life values(?,?)";
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1, uid);
		stmt.setString(2, name);
		int count=stmt.executeUpdate();
		System.out.println(count+ " is row affected count");
		stmt.close();
		con.close();
	}	
}
