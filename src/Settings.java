import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class Settings {
   public static void main(String[] args) {
      Connection conn;
      Statement stmt;
      String sql;
      
      Font f1 = new Font("HY헤드라인M", Font.PLAIN, 12);
      UIManager.put("OptionPane.messageFont", f1);
      
      try {
//         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=Asia/Seoul&useSSL=FALSE&allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=utf8&allowLoadLocalInfile=true", "root", "1234");
         
         stmt = conn.createStatement();
         
         // 파일을 읽어서 데이터를 넣을 수 있는 권한을 설정해줌
         stmt.execute("set global local_infile=true;");
         
         // if exists 존재여부를 따지고 있면 drop 
         stmt.execute("drop database if exists oldpopsong");
         System.out.println("drop db");
         
         // 데이터 베이스 생성 & 인코딩 설정
         stmt.execute("create database oldpopsong character set utf8 collate utf8_general_ci");
         System.out.println("create db");
         
         // 해당 데이터 베이스를 No database selected
         stmt.execute("use oldpopsong");
         System.out.println("use db");

		 String path = System.getProperty("user.dir").replaceAll("\\\\", "/");
		 int i = path.lastIndexOf("/");
		 path = path.substring(0, i)+"/datafiles/";
         
         sql = "create table music ("
		         + "m_no int primary key not null auto_increment comment '고유번호',"
		         + "m_name varchar(100) null comment'제목',"
		         + "singer varchar(50) null comment '아티스트명',"
		         + "album varchar(50) null comment '앨범',"
		         + "composer varchar(50) null comment '작곡가',"
		         + "lyricist varchar(50) null comment '작사가',"
		         + "playtime time null comment '재생시간',"
		         + "agelimit int null comment '연령제한\n 1 : 19금지 / 0 : 제한없음',"
		         + "soundquality varchar(50) null comment '음질',"
		         + "m_img longblob null comment '이미지'"
		       	 + ")";
		    stmt.execute(sql);
		    System.out.println("create music table");
		    stmt.execute("load data local infile '"+path+"music.txt' into table music lines terminated by '\r\n' ignore 1 rows");
		    
		    //user table 생성
		    sql = "create table user ("
		         + "u_no int primary key not null auto_increment comment '고유번호',"
		         + "id varchar(20) null,"
		         + "pw varchar(20) null,"
		         + "u_name varchar(20) null,"
		         + "birth date null comment '생년월일'"
		       	 + ")";
		    stmt.execute(sql);
		    System.out.println("create user table");
		    
		    stmt.execute("load data local infile '"+path+"user.txt' into table user lines terminated by '\r\n' ignore 1 rows");
			    
		    //playlist table 생성
	        sql = "CREATE TABLE playlist ("
	        	 + "p_no int primary key not null auto_increment comment '고유번호',"
	        	 + "u_no int null comment 'user 고유번호',"
	        	 + "m_no int null comment 'music 고유번호',"
	       		 + "foreign key (u_no) references user (u_no),"
	        	 + "foreign key (m_no) references music (m_no)"
	       		 + ")";
	        stmt.execute(sql);
	        System.out.println("create playlist table");
	        stmt.execute("load data local infile '"+path+"playlist.txt' into table playlist lines terminated by '\r\n' ignore 1 rows");
	        
	        //listenlist table 생성
	        sql = "CREATE TABLE listenlist ("
		         + "l_no int primary key not null auto_increment comment '고유번호',"
		         + "p_no int null comment 'playlist 고유번호\n',"
		       	 + "time varchar(14) null comment '재생을 멈춘 시간(yyyymmddhhmmss)',"
		       	 + "play_ox int null comment '0 : 듣기 중, 1 : 듣기 완료',"
		       	 + "stoptime time null,"
		       	 + "foreign key (p_no) references playlist(p_no)"
		       	 + ")";
	        stmt.execute(sql);
	        System.out.println("create listenlist table");
	        stmt.execute("load data local infile '"+path+"listenlist.txt' into table listenlist lines terminated by '\r\n' ignore 1 rows");
	        
	        stmt.execute("drop user if exists user");
			stmt.execute("create user user");
			stmt.execute("grant select, insert, delete, update on oldpopsong.* to user");
			System.out.println("유저생성 완료");
	         
			JOptionPane.showMessageDialog(null, "DB 세팅 완료", "정보", JOptionPane.INFORMATION_MESSAGE);
			stmt.close();
			conn.close();
      } catch(Exception e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(null, "DB 세팅 실패", "경고", JOptionPane.ERROR_MESSAGE);
      }
   }

}