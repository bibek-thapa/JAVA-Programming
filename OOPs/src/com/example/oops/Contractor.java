package com.example.oops;

import java.util.Date;

public class Contractor extends Employee{
	Date timeStart;
	Date timeEnd;
	float hourlyRate;
	public Contractor(Date timeStart, Date timeEnd, float hourlyRate) {
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.hourlyRate = hourlyRate;
	}
	
	
}
