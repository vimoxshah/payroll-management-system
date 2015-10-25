package main;
import  java.sql.*;
import javax.swing.*;
public class DbConnect {
	
	Connection conn;
	
	public static Connection doConnect(){
		
		String host = "jdbc:mysql://localhost:3306/pms"; 
        String uName = "root";
        String uPass = "1234";
        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, uName, uPass);
		//	JOptionPane.showMessageDialog(null, "Connection SuccessFully");
			System.out.println("Connected");
			return conn;
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
			return null;
		} 
	}

}
