package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.connection.DatabaseConnection;
import com.example.entity.Account;
import com.example.entity.Result;
import com.example.irepository.AccountRepo;

public class AccountRepository implements AccountRepo {

	@Override
	public Result add(Account t) {
		int rowInserted = 0;
		String sql = "INSERT INTO Account (Bank_id,Patron_id) VALUES (?,?)";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Integer.toString(t.getBank().getId()));
			stmt.setString(2, Integer.toString(t.getPatron().getId()));

			rowInserted = stmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if (rowInserted > 0) {
			return Result.SUCCESS;
		} else {
			return Result.FAILURE;
		}
	}

	@Override
	public Result remove(Account t) {
		int rowsDeleted = 0;
		String sql = "DELETE FROM Account WHERE id=?";

		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Integer.toString(t.getId()));
			rowsDeleted = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsDeleted > 0) {
			return Result.SUCCESS;
		} else {
			return Result.FAILURE;
		}
	}

	@Override
	public Result update(Account t) {
		String sql = "UPDATE Account SET Account.Bank_id = ?,Account.Patron_id=? WHERE id = ?";

		int rowsUpdated = 0;
		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Integer.toString(t.getBank().getId()));
			stmt.setString(2, Integer.toString(t.getPatron().getId()));
			stmt.setString(3, Integer.toString(t.getId()));
			rowsUpdated = stmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if (rowsUpdated > 0) {
			return Result.SUCCESS;
		} else {
			return Result.FAILURE;

		}
	}

	@Override
	public Account find(Long id) {
		Account account = new Account();
		BankRepository bankRepo = new BankRepository();
		PatronRepository patronRepo = new PatronRepository();
		String sql = "SELECT Account.Bank_id,Account.Patron_id FROM Account WHERE id = ?";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Long.toString(id));
			ResultSet result = stmt.executeQuery();

			while (result.next()) {

				Integer bankId = result.getInt("Bank_id");
				Integer patronId = result.getInt("Patron_id");

				account.setId(id.intValue());
				account.setBank(bankRepo.find(bankId.longValue()));
				account.setPatron(patronRepo.findPatron(patronId.longValue()));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(account.toString() + "Found in the account table");
		return account;
	}

	@Override
	public List<Account> find(String name) {
		List<Account> accountList = new ArrayList<>();

		return accountList;
	}

}
