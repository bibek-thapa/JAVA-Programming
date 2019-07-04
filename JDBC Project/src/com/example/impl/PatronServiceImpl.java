package com.example.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Patron;
import com.example.entity.Result;
import com.example.iService.PatronService;
import com.example.repository.PatronRepository;

public class PatronServiceImpl implements PatronService {

	PatronRepository patronRepo =  new PatronRepository();
	@Override
	public Result add(Patron t) {

		Result result=null;
		try {
			result = patronRepo.add(t);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(result.toString()+ " adding the elements");
		return result;
	}

	@Override
	public Result remove(Patron t) {

		Result result=null;
		try {
			result = patronRepo.remove(t);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(result.toString() + " Removing the elements");
		return result;
	}

	@Override
	public Result update(Patron t) {

		Result result=null;
		try 
		{
			
			result = patronRepo.update(t);
		
		} catch (SQLException e)
		
		{

			e.printStackTrace();
		}
		
		System.out.println(result.toString() + " Updating the elements");
		
		return result;
	}

	@Override
	public Patron find(Long id){

		Patron patron = new Patron();
		
		try {
			patron = patronRepo.findPatron(id);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		System.out.println(patron.toString() + " Found this element");
		return patron;
	}

	@Override
	public List<Patron> find(String name) {

		List<Patron> patronList = new ArrayList<>();
		
		try {
			patronList = patronRepo.findPatron(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(patronList.size());
		System.out.println(patronList.toString() + " Found these elements");
		return patronList;
	}

}
