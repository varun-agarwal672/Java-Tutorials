package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	
	String sql = "insert into login values(?,?)";
	String url = "jdbc:mysql://localhost:3306/varun";
	String username = "root";
	String password = "123456";
	public boolean updateInfo(String uname,String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			int rs = st.executeUpdate();
			
			if(rs!=0) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
