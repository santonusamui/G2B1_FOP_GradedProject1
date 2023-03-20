package com.greatlearning.javafsd.departmentalinfo.test;

import com.greatlearning.javafsd.departmentalinfo.SuperDepartment;

public class SuperDepartmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperDepartment superDepartment = new SuperDepartment();
		
		String departmentName = superDepartment.departmentName();
		System.out.println(departmentName);
		
		String todaysWork = superDepartment.getTodaysWork();
		System.out.println(todaysWork);
		
		
		String workDeadline = superDepartment.getWorkDeadline();
		System.out.println(workDeadline);
		
		String isTodayAHoliday = superDepartment.isTodayAHoliday();
		System.out.println(isTodayAHoliday);
	}

}
