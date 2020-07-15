package com.kita.second;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
private static OracleDAO dao = null;
	
	private OracleDAO() {}
	
	public static OracleDAO getInstance() { // �̱��� : getInstance()�� �̸� ���ߴ� ��, ���� null�� ��쿡 �� ��ü ����, ���� ��� ���� Ī�� ����
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
	
	public Connection getConn() throws Exception { // try catch�� ��� throws Exception�� ���� �ѱ�⵵ ���� 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("���� ����!!!");
		
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
