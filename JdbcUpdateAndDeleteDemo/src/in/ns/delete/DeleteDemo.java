package in.ns.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter ID of the row which we have delete:");
			int id = sc.nextInt();
			//Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Lcen@2001");
			// Create Statement
			PreparedStatement ps = con.prepareStatement("DELETE FROM DEPT WHERE ID=?");
			ps.setInt(1, id);
			// Execute Query
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("Deletion Successful");
			}
			else {
				System.out.println("Deletion Failure");
			}
			// Close the Connections
			ps.close();
			con.close();
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
