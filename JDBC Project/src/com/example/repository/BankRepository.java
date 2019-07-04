package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.connection.DatabaseConnection;
import com.example.entity.Bank;
import com.example.entity.Result;
import com.example.irepository.BankRepo;

public class BankRepository implements BankRepo {

	@Override
	public Result add(Bank t) {
		int rowInserted = 0 ;
		String sql = "INSERT INTO Bank (name) VALUES (?)";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1,t.getName());
		
		
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
	public Result remove(Bank t) {
		int rowsDeleted = 0 ;
		String sql = "DELETE FROM Bank WHERE name=?";
	
		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, t.getName());
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
	public Result update(Bank t) {
		String sql = "UPDATE Bank SET name = ? WHERE id = ?";
		
		int rowsUpdated = 0;
		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, t.getName());
			stmt.setString(2, Integer.toString(t.getId()));
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
	public Bank find(Long id) {
		Bank bank = new Bank();
		String sql = "SELECT Bank.name FROM Bank WHERE id = ?";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Long.toString(id));
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) 
			{
				String name = result.getString("name");
				System.out.println(name);
				
				bank.setId(id.intValue());
				bank.setName(name);
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
				
		return bank;
	}

	@Override
	public List<Bank> find(String name) {
		List<Bank> bankList = new ArrayList<>();
		
		String sql = "SELECT * FROM Bank WHERE name = ?";
		Connection conn;
		try {
			conn = DatabaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql); 
			stmt.setString(1, name);
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) 
			{
				Bank bank = new Bank();
				Integer id = result.getInt("id");
				String name1 = result.getString("name");	
				bank.setId(id);
				bank.setName(name1);			
				bankList.add(bank);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return bankList;
	}

}
