package com.example.connection;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DatabaseConnection {

	private DatabaseConnection() {
	}

	public static Connection getConnection() throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

		dataSource.setUrl("jdbc:mysql://localhost/JDBC_HW1");

		dataSource.setUsername("root");

		dataSource.setPassword("root");

		Connection conn = null;

		try {

			conn = dataSource.getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}

		return conn;

	}

}
