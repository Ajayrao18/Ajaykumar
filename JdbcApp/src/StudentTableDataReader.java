import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentTableDataReader {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Connection connection=null;
		Statement stmt=null;
		ResultSet rs=null;
		// register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?useSSL=false","root","ajayrao");
		//connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?useSSL=false","root","ajayrao");
		
		stmt=connection.createStatement();
		
		System.out.println("Statement created");
		
		rs=stmt.executeQuery("select distinct * from student");
		
		while(rs.next()) {// if row is avilable then rs.next() returns true
         int id= rs.getInt(1);
         String name=rs.getString(2);
         String address=rs.getString(3);
         System.out.println(id+"\t"+name+"\t"+address);
		}//end of while
 System.out.println("result set value"+rs.next());
 
 connection.close();
	}

}
