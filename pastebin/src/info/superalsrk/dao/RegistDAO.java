package info.superalsrk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

import info.superalsrk.entity.RegistUser;

public class RegistDAO {
	
	static Connection conn;  
	static Statement stmt;
	public static boolean save(RegistUser user) {
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
			String query = "insert into user values('" + user.getUsername() +"','" + user.getPassword() + "','" + user.getEmail()
					+"')";
			stmt.execute(query);
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

}
