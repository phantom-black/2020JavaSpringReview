package com.kita.second;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
private static OracleDAO dao = null;
	
	private OracleDAO() {}
	
	public static OracleDAO getInstance() { // 싱글톤 : getInstance()로 이름 맞추는 듯, 값이 null일 경우에 새 객체 생성, 이후 계속 같은 칭구 리턴
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	
	/*
	public static void main(String[] args) {
		OracleDAO dao = new OracleDAO();
		try {
			dao.getConn();
		} catch(Exception e) {
			
		}
		
	}
	*/
	
	public Connection getConn() throws Exception { // try catch문 대신 throws Exception로 예외 넘기기도 가능 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("접속 성공!!!");
		
		return con;
	}
	
	public void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {}
		}
	}
}
