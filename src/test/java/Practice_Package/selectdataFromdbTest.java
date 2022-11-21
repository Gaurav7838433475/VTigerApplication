package Practice_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectdataFromdbTest {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement state = con.createStatement();
		
		//String query1="INSERT INTO marksheet"+"VALUES('1','kumar','rahul','baridih','jsr')";
		//state.executeUpdate(query1);
		String query="select * from marksheet";
		
		ResultSet result = state.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
			System.out.println("=====data is fetched sucessfully=====");
		}
		}
		catch(Exception e)
		{
			System.out.println("exception occured and handled");
		}
		finally
		{
		con.close();
		System.out.println("=====db closed=====");
		}
	}
	}

