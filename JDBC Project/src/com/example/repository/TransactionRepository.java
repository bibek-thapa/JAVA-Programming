package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.connection.DatabaseConnection;
import com.example.entity.AccountType;
import com.example.entity.Result;
import com.example.entity.Transaction;
import com.example.irepository.TransactionRepo;

public class TransactionRepository implements TransactionRepo {

	@Override
	public Result add(Transaction t) {
		int rowInserted = 0 ;
		String sql = "INSERT INTO Transaction (Account_id,amount,type) VALUES (?,?,?)";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1,Integer.toString( t.getAccount().getId()));
		stmt.setString(2,Double.toString( t.getAmount()));
		stmt.setString(3, t.getAccountType().name());
		
		
		 rowInserted = stmt.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		if(rowInserted>0) 
		{
			return Result.SUCCESS;
		}
		else 
		{
			return Result.FAILURE;
		}
	}

	@Override
	public Result remove(Transaction t) {
		int rowsDeleted = 0 ;
		String sql = "DELETE FROM Transaction WHERE id=?";
	
		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Integer.toString(t.getId()));
			rowsDeleted = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		if(rowsDeleted > 0) {
		return Result.SUCCESS;
		}
		else 
		{
			return Result.FAILURE;
		}
	}

	@Override
	public Result update(Transaction t) {
		String sql = "UPDATE Transaction SET Transaction.Account_id = ?,Transaction.amount = ?,Transaction.type = ?  WHERE id = ?";
		
		int rowsUpdated = 0;
		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,Integer.toString( t.getAccount().getId()));
			stmt.setString(2, Double.toString(t.getAmount()));
			stmt.setString(3, t.getAccountType().toString());
			stmt.setString(4, Integer.toString(t.getId()));
			rowsUpdated = stmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(rowsUpdated > 0 ) 
		{
			return Result.SUCCESS;
		}
		else 
		{
			return Result.FAILURE;
					
		}
	}

	@Override
	public Transaction find(Long id) {
		Transaction transaction = new Transaction();
		AccountRepository accountRepo = new AccountRepository();
		
		
		String sql = "SELECT Transaction.Account_id,Transaction.amount,Transaction.type FROM Transaction WHERE id = ?";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Long.toString(id));
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) 
			{
				
				Integer accountId = result.getInt("Account_id");
				Double amount = result.getDouble("amount");
				String type = result.getString("type");
								
				transaction.setId(id.intValue());
				transaction.setAccount(accountRepo.find(accountId.longValue()));
				transaction.setAmount(amount);
				if(type.equalsIgnoreCase("CREDIT")) 
				{
					transaction.setAccountType(AccountType.CREDIT);
				}
				else 
				{
					transaction.setAccountType(AccountType.DEBIT);
				}
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(transaction.toString()+ "Found in the transaction table");	
		return transaction;
	}

	@Override
	public List<Transaction> find(String name) {
		List<Transaction> transactionList = new ArrayList<>();
			
		return transactionList;
	}


}
