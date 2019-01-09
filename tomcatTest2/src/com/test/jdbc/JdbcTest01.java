package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcTest01 {

	public static void main(String[] args) {
			Statement stat = null;
			ResultSet r = null;
			Connection conn=null;
			try {
				conn = JDBCUtil.getConn();
				stat = conn.createStatement();
				String sql = "select * from teacher;";
				r = stat.executeQuery(sql);
				while(r.next()) {
					int id = r.getInt("id");
					String name = r.getString("name");
					String address = r.getString("address");
					System.out.println(id+name+address);
				}
				r.close();
				stat.close();
				
			} catch(SQLException e) {
				e.printStackTrace();
				
			}
			finally {
				//JDBCutil
			    if (r != null) {
			        try {
			            r.close();
			        } catch (SQLException sqlEx) { } // ignore 
			        r = null;
			    }
			    if (stat != null) {
			        try {
			            stat.close();
			        } catch (SQLException sqlEx) { } // ignore
			        stat = null;
			    }
				
			}
			
		
	}


}
