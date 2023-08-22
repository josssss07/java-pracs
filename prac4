Java Data base Prac:

import java.sql.*;

public class DBdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb", "root", "maria"
					);
				System.out.println("Connection Successful");
					PreparedStatement ps = connection.prepareStatement("select * from authentication where uid = ?");
					ps.setInt(1,  101);
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getString("role"));
						
					}
			 
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}




//proper final code

import java.sql.*;
import java.util.*;

public class DBdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your UID:");
			int uidTemp = sc.nextInt();
			System.out.println("Enter your password");
			String passwordtemp = sc.next();
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb", "root", "maria"
					);
				System.out.println("Connection Successful");
					PreparedStatement ps = connection.prepareStatement("select * from authentication where uid = ? and password = ?");
					ps.setInt(1,  uidTemp);
					ps.setString(2, passwordtemp);
					
					
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						String pw = rs.getString("password");
						if(pw.equals(passwordtemp)) {
							System.out.println(rs.getInt("uid")+" \nRole: "+rs.getString("role"));
						}
						
					}
			 
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

