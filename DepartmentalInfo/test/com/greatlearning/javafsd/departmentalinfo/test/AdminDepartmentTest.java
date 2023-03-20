package com.greatlearning.javafsd.departmentalinfo.test;

import com.greatlearning.javafsd.departmentalinfo.AdminDepartment;


public class AdminDepartmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		SuperDepartment adminDepartment = new AdminDepartment();
		
		AdminDepartment adminDepartment = new AdminDepartment();
		
		String departmentName = adminDepartment.departmentName();
		System.out.println("Welcome to " + departmentName);
		
		String todaysWork = adminDepartment.getTodaysWork();
		System.out.println(todaysWork);
		
		
		String workDeadline = adminDepartment.getWorkDeadline();
		System.out.println(workDeadline);
		
		String isTodayAHoliday = adminDepartment.isTodayAHoliday();
		System.out.println(isTodayAHoliday);
		
		
		

	}

}
