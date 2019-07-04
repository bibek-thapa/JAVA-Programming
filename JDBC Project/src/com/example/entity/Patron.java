package com.example.entity;

import java.util.Arrays;

public class Patron {
	
	int id;
	String name;
	byte[] image;
	
	public Patron() 
	{
		
	}
	
	public Patron(int id, String name, byte[] image) {
		this.id = id;
		this.name = name;
		this.image = image;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public byte[] getImage() {
		return image;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Patron [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	

}
