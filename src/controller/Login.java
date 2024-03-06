package controller;

import javax.swing.*;

import core.Controller;
import core.DBConn;
import model.user;
import view.main;

public class Login extends Controller{
	public String IdField = "";
	public String PwField = "";
	
	public Login() {
		super();
	}
	
	public void SetData(String IdField, String PwField) {
		this.IdField = IdField;
		this.PwField = PwField;
	}
	
	public boolean ValidLogin() {
		if(IdField.isEmpty() || PwField.isEmpty()) {
			JOptionPane.showMessageDialog(null, "빈칸이 있습니다.","경고",JOptionPane.ERROR_MESSAGE);
		} else{
			try {
				rs = stmt.executeQuery("select * from user where id = '"+IdField+"' and pw = '"+PwField+"'");
				
				if(rs.next()) {
					user.id = rs.getString("id");
					user.pw = rs.getString("pw");
					user.u_name = rs.getString("u_name");
					user.birth = rs.getString("birth");
					
					new main();
					return true;
				} else {
					JOptionPane.showMessageDialog(null, "로그인 정보가 일치하지 않습니다.","경고",JOptionPane.ERROR_MESSAGE);
				}
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	public void init(){
		IdField = "";
		PwField = "";
	}
}
