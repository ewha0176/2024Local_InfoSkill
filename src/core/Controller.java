package core;

import java.sql.*;

public class Controller {
	protected Connection conn;
	protected Statement stmt;
	protected ResultSet rs;
	
	public Controller() {
		DBConn db = new DBConn();
		conn = db.conn;
		stmt = db.stmt;
	}
	
	public void dispose(){
		try {
			stmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
