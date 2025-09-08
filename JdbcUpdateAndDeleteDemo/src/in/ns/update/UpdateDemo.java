package in.ns.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID where to update name:");
			int id = sc.nextInt();
			sc.nextLine();  // consume leftover newline
			System.out.println("Enter the name:");
			String name = sc.nextLine();
			//Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Lcen@2001");
			// Create Statement
			PreparedStatement ps = con.prepareStatement("UPDATE DEPT SET NAME=? WHERE ID=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			// Execute Query
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("Updation Successful");
			}
			else {
				System.out.println("Updation Failure");
			}
			// Close the Connection
			ps.close();
			con.close();
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
