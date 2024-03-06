package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConn {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	
	public DBConn(){
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=Asia/Seoul&useSSL=FALSE&useUnicode=true&characterEncoding=utf8&allowLoadLocalInfile=true", "user", "");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.execute("use oldpopsong");
		} catch(Exception e) {
			
		}
	}
}
