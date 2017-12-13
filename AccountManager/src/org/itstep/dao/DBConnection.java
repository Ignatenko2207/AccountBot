package org.itstep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String DB_URL = "jdbc:postgresql://localhost:5432/botdb";
	private static final String USER_NAME = "postgres";
	private static final String USER_PASSWORD = "24488442";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.pstgresql.Driver");
			connection = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASSWORD); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return connection;
	}
}
