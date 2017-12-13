package org.itstep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.itstep.model.Account;

public class AccountDAO {

	public void save(Account account) {

		Connection connection = null;
		PreparedStatement statement = null;
		
		String sql = "INSERT INTO accounts(first_name, second_name, email, password) VALUES(?,?,?,?)";
		
		try {
			connection = DBConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, account.getFirstName());
			statement.setString(2, account.getSecondName());
			statement.setString(3, account.getEmail());
			statement.setString(4, account.getPassword());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Account get(String firstName, String secondName) {

		return null;
	}

	public void update(Account accInDB, Account accUpdated) {
		

		String sql = "UPDATE accounts SET first_name=?, second_name=?, email=?, password=? WHERE first_name=? AND second_name=?";
	}

	public void delete(String firstName, String secondName) {

		String sql = "DELETE accounts WHERE first_name=? AND second_name=?";
		
	}
}
