package in.ns.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
	public static void main(String[] args) {
		try {
			//Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Lcen@2001");
			//Create Statement
			PreparedStatement ps = con.prepareStatement("SELECT * FROM DEPT");
			//Execute Query
			ResultSet rs = ps.executeQuery();
			System.out.println("DEPT ID"+"  "+"NAME");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"          "+rs.getString(2));
			}
			//Close the Connections
			rs.close();
			ps.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
