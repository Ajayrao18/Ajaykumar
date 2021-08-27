import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class BatchUpdate {

	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/mysql?useSSL=false";
		String username="root";
		String password="ajayrao";
		Connection connection=null;
		ResultSet rs=null;
		
		
		try {
			connection=DriverManager.getConnection(jdbcURL,username,password);
			
			Statement statement = connection.createStatement();
			
			statement.addBatch("INSERT INTO student values(104,'kumar','nagpur','dbms')");
			statement.addBatch("UPDATE student set address='mumbai' where id=106");
			
			int[] updateCounts=statement.executeBatch();
			
			for(int count: updateCounts) {
				System.out.println(count);
			}
			
           rs=statement.executeQuery("select distinct * from student");
			
			while(rs.next()) {// if row is avilable then rs.next() returns true
		         int id= rs.getInt(1);
		         String name=rs.getString(2);
		         String address=rs.getString(3);
		         System.out.println(id+"\t"+name+"\t"+address);
				}//end of while
			connection.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		

	}

}
