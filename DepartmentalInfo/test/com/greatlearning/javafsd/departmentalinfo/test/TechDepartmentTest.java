package com.greatlearning.javafsd.departmentalinfo.test;

import com.greatlearning.javafsd.departmentalinfo.TechDepartment;

public class TechDepartmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        TechDepartment techDepartment = new TechDepartment();
		
		
		
		String departmentName = techDepartment.departmentName();
		System.out.println("Welcome to " + departmentName);
						
		String todaysWork = techDepartment.getTodaysWork();
		System.out.println(todaysWork);
		
		
		String workDeadline = techDepartment.getWorkDeadline();
		System.out.println(workDeadline);
		
		String techStackInfo = techDepartment.techStackInformation();
		System.out.println(techStackInfo);
		
		String isTodayAHoliday = techDepartment.isTodayAHoliday();
		System.out.println(isTodayAHoliday);

	}

}
