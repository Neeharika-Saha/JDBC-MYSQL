package in.ns.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String[] args) {
		// User Values, we can use Scanner 
		int id = 104;
		String name = "ME";
		try {
			// Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create Connection
			// getConnection("url","username","password");
			// url = jdbc:mysql://localhost:3306/database_name
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Lcen@2001");
			
			// Create Statement
			//PreparedStatement ps = con.prepareStatement("INSERT INTO DEPT VALUES(102,'ECE')");
			PreparedStatement ps = con.prepareStatement("INSERT INTO DEPT VALUES(?,?)");
			ps.setInt(1,id);
			ps.setString(2,name);
			
			// Execute Query
			int x = ps.executeUpdate();
			System.out.println(x > 0 ? "Insert Success" : "Insert Failure");
			System.out.println("Updated table after insertion operation:");
			
			// SELECT using getInt() and getString()
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM DEPT");
            while (rs.next()) {
                int deptId = rs.getInt(1);      // column index
                String deptName = rs.getString(2); // column index
                System.out.println(deptId + " " + deptName);
            }
			
			// Close the connections
            rs.close();
            st.close();
			ps.close();
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
