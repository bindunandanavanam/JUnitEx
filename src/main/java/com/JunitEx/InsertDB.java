package com.JunitEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDB {
	Scanner sc=new Scanner(System.in);
	public int intoDB(int a, String name) {
		int x=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu","root","root");
			PreparedStatement ps= con.prepareStatement("insert into emp values (?,?)");
			ps.setInt(1, a);
			ps.setString(2,name);
			x=ps.executeUpdate();
			con.close();
	
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sc.close();
	return x;
	
}
	public int deleteDB(int rno) {
		int x1=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu","root","root");
			
		PreparedStatement ps= con.prepareStatement("delete from emp where rno=?");
		ps.setInt(1, rno);
		x1=ps.executeUpdate();
		con.close();

	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
sc.close();
return x1;

}
	public int updateDB(String name, int a){
		int x1=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu","root","root");
			
			PreparedStatement ps= con.prepareStatement("update emp set name=? where rno=?");
			
			
			ps.setString(1, name);
			ps.setInt(2, a);
			x1=ps.executeUpdate();
			con.close();
	
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sc.close();
	return x1;
	
}
		
	}

