package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		String url ="jdbc:mysql:localhost:3306:login";
		String user="root";
		String password="password";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user name");
		String user1 = sc.nextLine();
		System.out.println("enter the password");
		int pass = sc.nextInt();
		
		String sql = "insert into loginpage values('"+user1+"','"+pass+"')";
		Connection con = null;
		try
		{
			DriverManager.registerDriver(new mysql.jdbc.mysql());
			Statement st = con.createStatement();
			int m= st.executeUpdate("insert succesfull;"+sql);
			if(m==1)
			{
				System.out.println("insert successfully");
			}
			else
			{
				System.out.println("insertion fail");
				con.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
