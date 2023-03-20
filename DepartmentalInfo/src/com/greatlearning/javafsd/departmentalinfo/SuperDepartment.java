package com.greatlearning.javafsd.departmentalinfo;

public class SuperDepartment {
	
	String departmentName;
	String todaysWork;
	String workDeadline;
	String isTodayAHoliday;
	
	public String departmentName() {
		
		this.departmentName = "Super Department";
		return departmentName;
		
	}
	
	public String getTodaysWork() {
		
		this.todaysWork = "No Work as of now";
		return todaysWork;
		
	}
	
	
	public String getWorkDeadline() {
		
		this.workDeadline = "Nil";
		return workDeadline;
		
	}
	
	public String isTodayAHoliday() {
		
		this.isTodayAHoliday = "Today is not a holiday";
		return isTodayAHoliday;
		
	}
}
