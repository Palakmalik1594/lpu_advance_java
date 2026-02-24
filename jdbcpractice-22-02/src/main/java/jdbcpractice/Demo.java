package jdbcpractice;
import java.sql.*;
public class Demo {
	
/*
 * 1. import ->java.sql
 * 2. load and register the driver
 * 3. create connection -Connection
 * 4. create a statement- Statement
 * 5. execute a query
 * 6. process the result
 * 7. close
 */

public static void main(String[] args) throws Exception{
	Class.forName("org.postgresql.Driver");
	String url="jdbc:postgresql://localhost:5432/college";
	String username="postgres";
	String pass="root";
	Connection con=DriverManager.getConnection(url,username,pass);
	Statement stmt=con.createStatement();
	/*
	String sq="create table life(id int,name varchar(20))";
	stmt.executeUpdate(sq);
	String ss1="insert into life values(1,'palak')";
	stmt.executeUpdate(ss1);
	
	String ss2="insert into life values(2,'avni')";
	stmt.execute(ss2);
	*/
	String s="select * from life";
	//we learnt how to fetch data for whole table using resultset
	ResultSet rs=stmt.executeQuery(s);
	while(rs.next()) {
	String userdata=rs.getInt(1)+" "+rs.getString(2);
	System.out.println(userdata);
	}
	stmt.close();
	con.close();
	
	
	
	
}
}
