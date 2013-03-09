package info.superalsrk.dao;

import info.superalsrk.entity.LoginUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class LoginDAO {
	static Connection conn;  
	static Statement stmt;
	
	public static boolean checkLogin(LoginUser user) {
		try {  
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动  
              
            conn = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/pastebin", "omoika", "1234");// 创建数据连接  
              
        } catch (Exception e) {  
            System.out.println("数据库连接失败" + e.getMessage());  
            return false;
        }
		
		try {
			stmt = conn.createStatement();
			String query = "select * from user where username='" + user.getUsername()+"'";
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				String pass = rs.getString("password");
				
				if(user.getPassword().equals(pass)) {

					conn.close();
					return true;
				}
				
			
			}
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		return false;
	}
}
