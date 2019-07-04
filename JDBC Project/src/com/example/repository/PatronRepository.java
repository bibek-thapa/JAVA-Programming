package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.connection.DatabaseConnection;
import com.example.entity.Patron;
import com.example.entity.Result;



public class PatronRepository {
	
	
	
	public Result add(Patron p) throws SQLException 
	{
		String sql = "INSERT INTO Patron (name,image) VALUES (?,?)";
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		//stmt.setString(1,Integer.toString(p.getId()));
		stmt.setString(1,p.getName());
		stmt.setString(2, p.getImage().toString());
		
		int rowInserted = stmt.executeUpdate();
		if(rowInserted>0) 
		{
			return Result.SUCCESS;
		}
		else 
		{
			return Result.FAILURE;
		}
		
		
		
	}
	
	public Result remove(Patron patron) throws SQLException 
	{
		String sql = "DELETE FROM Patron WHERE name=?";
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, patron.getName());
		int rowsDeleted = stmt.executeUpdate();
		
		if(rowsDeleted > 0) {
		return Result.SUCCESS;
		}
		else 
		{
			return Result.FAILURE;
		}
	}
	
	public Result update (Patron patron) throws SQLException 
	{
		String sql = "UPDATE Patron SET name = ? WHERE id = ?";
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, patron.getName());
		stmt.setString(2, Integer.toString(patron.getId()));
		int rowsUpdated = stmt.executeUpdate();
		if(rowsUpdated > 0 ) 
		{
			return Result.SUCCESS;
		}
		else 
		{
			return Result.FAILURE;
					
		}
		
		
	}
	
	public Patron findPatron(Long id) throws SQLException 
	{
		Patron patron = new Patron();
		String sql = "SELECT Patron.name,Patron.image FROM Patron WHERE id = ?";
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, Long.toString(id));
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) 
		{
			String name = result.getString("name");
			byte[] image = result.getBytes("image");
			System.out.println(name);
			
			patron.setId(id.intValue());
			patron.setName(name);
			patron.setImage(image);
		}
		
		
		return patron;
		
	}
	
	
	public List<Patron> findPatron(String name) throws SQLException
	{
		List<Patron> patronList = new ArrayList<>();
		
		String sql = "SELECT * FROM Patron WHERE name = ?";
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql); 
		stmt.setString(1, name);
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) 
		{
			Patron patron = new Patron();
			Integer id = result.getInt("id");
			String name1 = result.getString("name");
			byte[] image = result.getBytes("image");
			patron.setId(id);
			patron.setName(name1);
			patron.setImage(image);
			patronList.add(patron);
		}
		
		
		
		return patronList;
		
	}
	

}
