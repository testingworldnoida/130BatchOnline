package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from customers;");
		while(rs.next()){
			System.out.println(rs.getString("phone")+  "   " +  rs.getString(1));
			
		}
		
	}

}
