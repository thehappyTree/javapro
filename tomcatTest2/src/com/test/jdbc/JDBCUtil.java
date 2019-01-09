package com.test.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

	public static Connection getConn()  {
		Connection conn = null;
		Properties properties = new Properties();
		//BufferedReader bufferedReader = new BufferedReader(new FileReader("./jdbc.properties"));
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			properties.load(is);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		String driver = properties.getProperty("driverClass");
		String URL = properties.getProperty("url");
		String USER = properties.getProperty("user");
		String PASSWORD = properties.getProperty("password");
		System.out.print(driver+URL+USER+PASSWORD);
		try {

			Class.forName(driver);
			//DriverManager.registerDriver("com.mysql.jdbc.Driver");
			System.out.println("connection....");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			if (conn != null) {
				System.out.println("success...");
			}
		}catch(Exception e) {
			e.printStackTrace();
			}
		return conn;
	}
	
	public static void release(Connection conn, Statement stat, ResultSet rs) {
		closeConn(conn);
		closeSt(stat);
		closeRs(rs);
		
	}
	public static void closeConn(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
				
			}
			
		}
		catch(SQLException e) {
			//e.printStackTrace();
		}
		finally {
			conn = null;
		}
		
	}
	public static void closeSt(Statement stat) {
		try {
			if (stat != null) {
				stat.close();
			}
			
			
		}catch(SQLException e) {
			
		}finally {
			stat = null;
		}
		
		
	}
	public static void closeRs(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} finally {
			rs = null;
		}
		
		
	}

}
