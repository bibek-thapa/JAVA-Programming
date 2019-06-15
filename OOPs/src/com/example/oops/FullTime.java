package com.example.oops;

import java.util.Date;

public class FullTime extends Employee{
	Date timeStart;
	float baseSalaryPerYear;
	float bonusPerYear;
	public FullTime(Date timeStart, float baseSalaryPerYear, float bonusPerYear) {
		super();
		this.timeStart = timeStart;
		this.baseSalaryPerYear = baseSalaryPerYear;
		this.bonusPerYear = bonusPerYear;
	}
	
	
}
